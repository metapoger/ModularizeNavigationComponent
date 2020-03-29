package com.metapoger.data_storage

import com.metapoger.core.User

interface UserRepository {
    fun getUsersList(): ArrayList<User>
    fun getUser(userId: Int): User?
}