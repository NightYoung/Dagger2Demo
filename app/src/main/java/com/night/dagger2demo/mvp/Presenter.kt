package com.night.dagger2demo.mvp

import javax.inject.Inject

/**
 * <p>作者：Night  2019/2/11 10:58
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 */
class Presenter @Inject constructor(
    private val mView: IView, private val mModel: Model
) {

    fun getData() {

        //模拟网络延时
        Thread.sleep(2000)
        mView.setData(mModel.getData())
    }
}