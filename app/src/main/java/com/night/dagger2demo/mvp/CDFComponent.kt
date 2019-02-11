package com.night.dagger2demo.mvp

import dagger.Subcomponent

/**
 * <p>作者：Night  2019/2/11 11:11
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 */
@Subcomponent(modules = [CDFModule::class])
interface CDFComponent {

    fun inject(f: F)
}