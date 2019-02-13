package com.night.dagger2demo.car

import dagger.Module
import dagger.Provides

/**
 * <p>作者：Night  2019/2/11 17:52
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 */

@Module
class CarModule {

    @Provides
    @ActivityScope
    fun provideCar(): Car {

        return Car()
    }
}