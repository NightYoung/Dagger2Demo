package com.night.dagger2demo.car

import android.util.Log
import javax.inject.Inject

/**
 * <p>作者：Night  2019/2/11 16:54
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 */
class Car @Inject constructor() {

    init {
        Log.d("hsc", "Car 初始化")
    }

    fun go() {
        println("This car is going to go ......")
    }

    override fun toString() = "Car"
}