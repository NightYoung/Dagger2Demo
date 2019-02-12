package com.night.dagger2demo.cloth

import com.night.dagger2demo.MainActivity
import dagger.Component

/**
 * <p>作者：Night  2019/1/30 17:00
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 *
 * component：
 *      组件，管理器，注入器
 *将类中使用@Inject标记的属性和在对应属性类中使用@Inject标记的构造方法关联起来
 *
 * 如果构造方法取消参数，或者我们没法在需要注入的对象的构造方法中加入@Inject注解的
 * 时候就需要使用Module
 *
 * modules: 声名该component含有那几个module
 * dependencies:    声名该component的依赖关系
 */
@Component(modules = [MainModule::class])
interface MainComponent {

    /**
     * inject方法的参数不能用父类类接收
     */
    fun inject(mainActivity: MainActivity)
}