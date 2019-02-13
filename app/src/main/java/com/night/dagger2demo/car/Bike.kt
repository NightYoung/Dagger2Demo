package com.night.dagger2demo.car

import android.util.Log

/**
 * <p>作者：Night  2019/2/13 15:07
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 */
class Bike {

    init {
        Log.d("hsc", "Bike 初始化")
    }

    fun go() {
        println("This bike is going to go ......")
    }

    override fun toString() = "Bike"
}