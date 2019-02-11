package com.night.dagger2demo.mvp

import dagger.Module
import dagger.Provides

/**
 * <p>作者：Night  2019/2/11 10:50
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 */

@Module
class D {

    @Provides
    fun provideC() = "做一些初始化工作，例如 Retrofit 初始化"
}