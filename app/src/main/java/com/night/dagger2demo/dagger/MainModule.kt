package com.night.dagger2demo.dagger

import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * <p>作者：Night  2019/1/30 16:50
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
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