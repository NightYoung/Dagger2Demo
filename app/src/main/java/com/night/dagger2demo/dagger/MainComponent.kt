package com.night.dagger2demo.dagger

import com.night.dagger2demo.MainActivity
import dagger.Component

/**
 * <p>作者：Night  2019/1/30 17:00
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 *
 * modules: 声名该component含有那几个module
 * dependencies:    声名该component的依赖关系
 */
@Component(modules = [MainModule::class])
interface MainComponent {

    /**
     * inject方法的参数不能用父类类接收
     */
    fun inject(mainActivity: MainActivity)
}