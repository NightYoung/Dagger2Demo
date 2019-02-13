package com.night.dagger2demo.car

/**
 * <p>作者：Night  2019/2/12 15:59
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 */

fun main() {
    val carFactory = CarFactory()
    val madeCar: List<Car> = carFactory.makeCar(9)

    madeCar.forEach { println(it) }
}