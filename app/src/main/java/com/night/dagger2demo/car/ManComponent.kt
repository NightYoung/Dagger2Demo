package com.night.dagger2demo.car

import dagger.Component

/**
 * <p>作者：Night  2019/2/11 17:00
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 *
 *
 * 链接Car和Man之间的依赖
 */
@ActivityScope
@Component(modules = [CarModule::class])
interface ManComponent {

    //注入Man时所需要的依赖
    fun injectMan(man: Man)

    //必须向外提供 car 依赖实例的接口，表明 Man 可以借 car 给别人
    fun car(): Car

    fun sonComponent(): SonComponent.Builder
}