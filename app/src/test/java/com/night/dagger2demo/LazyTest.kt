package com.night.dagger2demo

/**
 * <p>作者：Night  2019/2/12 10:47
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 *
 * by lazy 初始化val
 *      是一种属性委托
 *      lazy接收一个lambda表达式，并返回一个 lazy<T> 实例的函数
 *      返回的实例可以作为实现延迟属性的委托
 *      第一次调用get()会执行已传递给lazy()的lambda表达式并记录结果
 *      后续调用get只是返回记录的结果
 *
 * lateinit 初始化var
 *      只能在生命周期流程中进行获取或者初始化的变量
 *      只能用来修饰类属性，不能用来修饰局部变量
 *      只能用来修饰对象，不能用来修饰基本类型
 */

fun main() {
    val lazyStr by lazy {
        println("lazy str init")
        "Hello lazy str"
    }

    println(lazyStr)
    println(lazyStr)
    println(lazyStr)
}