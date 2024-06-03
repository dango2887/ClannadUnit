package com.dango.clannad

import android.app.Application
import com.dango.clannad.kit.ClKit

class ClApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        ClKit.init(this)
    }
}