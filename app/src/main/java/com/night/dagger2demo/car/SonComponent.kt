package com.night.dagger2demo.car

import dagger.Subcomponent

/**
 * <p>作者：Night  2019/2/13 15:09
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 */
@Subcomponent(modules = [BikeModule::class])
interface SonComponent {

    fun injectSon(son: Son)

    @Subcomponent.Builder
    interface Builder {
        fun build(): SonComponent
    }
}