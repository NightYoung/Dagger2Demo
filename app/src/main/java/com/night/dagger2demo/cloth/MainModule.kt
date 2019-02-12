package com.night.dagger2demo.cloth

import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * <p>作者：Night  2019/1/30 16:50
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 *
 * Module：提供者，依赖对象工厂
 * 功能与被@Inject标记的构造方法一样提供生成依赖的对象
 *
 * 由于第三方库我们没有办法在它的构造方法中加入@Inject注解
 * 这时我们我们需要使用Module类生成，并提供@Provide注解,
 * Component会去查找Module类中@Provide的方法并获取到对象
 * 并通过component返回目标类需要的对象并注入到目标类
 *
 * MainModule类用来提供Cloth对象，相当于创建了一个提供商
 *
 * Module       为供货商
 * Provider     为供货商的生产线(生产不同的商品)
 */
@Module
class MainModule {

    //创建一条生产线，用来提供衣服（Provider）
    @Provides
    @Named("red")
    fun getRedCloth(): Cloth {
        val cloth = Cloth()
        cloth.color = "红色"

        return cloth
    }

    @Provides
    @Named("blue")
    fun getBlueCloth(): Cloth {
        val cloth = Cloth()
        cloth.color = "蓝色"

        return cloth
    }
}