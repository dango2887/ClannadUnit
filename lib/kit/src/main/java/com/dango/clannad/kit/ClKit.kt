package com.dango.clannad.kit

import android.annotation.SuppressLint
import android.content.Context

@SuppressLint("StaticFieldLeak")
object ClKit {

    private lateinit var context: Context

    fun init(context: Context) {
        this.context = context.applicationContext
    }
}