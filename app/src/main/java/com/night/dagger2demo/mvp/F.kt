package com.night.dagger2demo.mvp

import javax.inject.Inject

/**
 * <p>作者：Night  2019/2/11 10:56
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 */
class F : IView {

    override fun setData(str: String) {
        println(str)
    }

    @Inject
    lateinit var m: Presenter

    init {
        NightApp.instance.cdComponent.plus(CDFModule(this)).inject(this)
    }

    fun getData() = m.getData()
}