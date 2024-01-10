package com.jsyntax.customvoicelauncher

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Vibrator

class VoiceActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_voice)
        val vibrator = getSystemService(VIBRATOR_SERVICE) as Vibrator
        vibrator.vibrate(50)
        val i = Intent()
        // You can replace with your own voice assistant.
        i.setClassName("com.google.android.apps.assistant", "com.google.android.apps.assistant.go.MainActivity")
        i.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(i)
        finish()
    }
}