package com.night.dagger2demo

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.night.dagger2demo.dagger.Cloth
import com.night.dagger2demo.dagger.DaggerMainComponent
import com.night.dagger2demo.dagger.Shoe
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named


/**
 * <p>作者：Night  2019/1/31 10:53
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：依赖注入
 *
 * 使用注解，不需要实例化对象，就可以拿到对象实例
 *
 * Dagger2依赖注入的方式
 *
 * 方式1：使用依赖注入的类添加Inject注解构造函数 + Component声名要注入的类
 * 方式2：声名类 + Module类(提供商，生产线) + Component类
 *                兼容第三方库，无法给类的构造函数添加Inject注解的情况
 */
@SuppressLint("SetTextI18n")
class MainActivity : AppCompatActivity() {
    @Inject
    @field:Named("red")
    lateinit var redCloth: Cloth

    @Inject
    @field:Named("blue")
    lateinit var blueCloth: Cloth

    @Inject
    lateinit var mShoe: Shoe

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //依赖注入
        DaggerMainComponent.builder().build().inject(this)

        tv_cloth.text = "I have $redCloth and $blueCloth, I also have $mShoe"
    }
}
