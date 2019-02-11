package com.night.dagger2demo.mvp

import dagger.Component
import javax.inject.Singleton

/**
 * <p>作者：Night  2019/2/11 10:52
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 */

@Singleton
@Component(modules = [D::class])
interface CDComponent {

    fun inject(e: NightApp)

    fun plus(cdfModule: CDFModule): CDFComponent
}