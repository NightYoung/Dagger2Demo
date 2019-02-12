package com.night.dagger2demo.cloth

/**
 * <p>作者：Night  2019/1/30 16:47
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 *
 * Cloth类用作依赖对象
 */
class Cloth {
    var color: String = ""

    override fun toString(): String {
        return "${color}布料"
    }
}