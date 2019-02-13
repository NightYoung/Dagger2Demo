package com.night.dagger2demo.car

import dagger.Module
import dagger.Provides

/**
 * <p>作者：Night  2019/2/13 15:12
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 */
@Module
class BikeModule {

    @Provides
    fun provideBike(): Bike {

        return Bike()
    }
}