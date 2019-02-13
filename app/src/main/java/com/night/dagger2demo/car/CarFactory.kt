package com.night.dagger2demo.car

import javax.inject.Inject
import javax.inject.Provider

/**
 * <p>作者：Night  2019/2/12 13:59
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 */
class CarFactory {
    @Inject
    lateinit var carProvider: Provider<Car>

    fun makeCar(num: Int): List<Car> {
        val carList = ArrayList<Car>()

        for (i in 0..num) {
            carList.add(carProvider.get())
        }

        return carList
    }
}