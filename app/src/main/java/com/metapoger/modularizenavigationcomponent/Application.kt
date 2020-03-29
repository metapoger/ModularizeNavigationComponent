package com.metapoger.modularizenavigationcomponent

import android.app.Application
import com.metapoger.data_storage.MemoryUserRepository

class Application : Application(){
    override fun onCreate() {
        super.onCreate()
        MemoryUserRepository.init(applicationContext)
    }
}