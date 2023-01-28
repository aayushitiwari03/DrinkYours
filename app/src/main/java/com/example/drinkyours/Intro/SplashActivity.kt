package com.example.drinkyours.Intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.drinkyours.MainActivity
import com.example.drinkyours.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val img:ImageView=findViewById(R.id.imageColdinks)

        img.alpha=0f
        img.animate().setDuration(2000).alpha(1f).withEndAction {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }
}