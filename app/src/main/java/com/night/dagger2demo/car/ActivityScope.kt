package com.night.dagger2demo.car

import javax.inject.Scope

/**
 * <p>作者：Night  2019/2/12 16:26
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 *
 * 自定义Scope注解
 */

@Scope
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class ActivityScope