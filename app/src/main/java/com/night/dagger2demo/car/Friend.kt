package com.night.dagger2demo.car

import javax.inject.Inject

/**
 * <p>作者：Night  2019/2/13 14:47
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 */
class Friend {
    @FriendScope
    @Inject
    lateinit var mCar: Car

    init {
        val manComponent = DaggerManComponent.builder()
            .build()

        DaggerFriendComponent.builder()
            .manComponent(manComponent)
            .build()
            .injectFriend(this)
    }

    fun goSightseeing() {
        mCar.go()
    }
}