package com.night.dagger2demo.car

import javax.inject.Inject

/**
 * <p>作者：Night  2019/2/13 15:06
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 */
class Son {

    init {
        val manComponent = DaggerManComponent.builder().build()
        val sonComponent = manComponent.sonComponent().build()
        sonComponent.injectSon(this)
    }

    @Inject
    lateinit var mCar: Car
    @Inject
    lateinit var mBike: Bike


}