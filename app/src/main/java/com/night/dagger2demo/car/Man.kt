package com.night.dagger2demo.car

import dagger.Lazy
import javax.inject.Inject

/**
 * <p>作者：Night  2019/2/11 16:56
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 *
 * 使用注解的地方初始化
 */
class Man {

    @ManScope
    lateinit var mCar: Car
        @Inject set

    @Inject
    lateinit var lazyCar: Lazy<Car>

    init {
        DaggerManComponent.create().injectMan(this)
    }

    override fun toString(): String = "I have a $mCar"

    fun goWork() {
        //获取car实例
        lazyCar.get().go()
    }
}