package com.dango.clannad

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.dango.clannad.ui.main.MainFragment
import com.google.android.gms.games.PlayGames
import com.google.android.gms.games.PlayGamesSdk

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
        findViewById<Button>(R.id.btn_login).setOnClickListener {
            PlayGamesSdk.initialize(this)
        }
//        PlayGames.getAchievementsClient(this).unlock(getString(R.string.app_name));
//
//        PlayGames.getAchievementsClient(this).unlock(getString(R.string.app_name));
//
//        PlayGames.getAchievementsClient(this).unlock(getString(R.string.app_name));
//
//        PlayGames.getAchievementsClient(this).unlock(getString(R.string.app_name));
    }
}