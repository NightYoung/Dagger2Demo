package com.night.dagger2demo.mvp

import javax.inject.Inject

/**
 * <p>作者：Night  2019/2/11 10:49
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 *
 * 初始化工作
 */
class NightApp {
    @Inject
    lateinit var cdComponent: CDComponent

    init {
        //初始化工作
        instance = this
        DaggerCDComponent.builder().d(D()).build().inject(this)
    }


    companion object {
        lateinit var instance: NightApp
    }
}