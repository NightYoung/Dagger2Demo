package com.night.dagger2demo.mvp

import javax.inject.Inject

/**
 * <p>作者：Night  2019/2/11 10:58
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 */
class Model @Inject constructor() {

    fun getData() = "这是数据源"
}