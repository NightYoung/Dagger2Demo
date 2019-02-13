package com.night.dagger2demo.car

import dagger.Component

/**
 * <p>作者：Night  2019/2/13 14:48
 * <p>邮箱：codinghuang@163.com
 * <p>作用：
 * <p>描述：Dagger2Demo
 */

@FriendScope
@Component(dependencies = [ManComponent::class])
interface FriendComponent {

    fun injectFriend(friend: Friend)
}