package com.metapoger.data_storage

import android.content.Context
import androidx.core.content.ContextCompat
import com.metapoger.core.User
import kotlin.random.Random

object MemoryUserRepository : UserRepository {

    private val users = ArrayList<User>()

    private val avatars = arrayOf(
        R.drawable.avatar_1_raster,
        R.drawable.avatar_2_raster,
        R.drawable.avatar_3_raster,
        R.drawable.avatar_4_raster,
        R.drawable.avatar_5_raster,
        R.drawable.avatar_6_raster
    )

    fun init(context: Context) {
        val names = context.resources.getStringArray(R.array.names)
        val random = Random(6)
        users.clear()
        names.forEachIndexed { index, name ->
            users.add(
                User(
                    id = index,
                    avatar = ContextCompat.getDrawable(context, avatars[random.nextInt()])!!,
                    name = name
                )
            )
        }
    }

    override fun getUsersList() = ArrayList(users)

    override fun getUser(userId: Int) = users.firstOrNull { it.id == userId }
}