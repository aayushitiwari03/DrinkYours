package com.example.drinkyours

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.drinkyours.onBording.OnBoardingOne


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val img:ImageView=findViewById(R.id.imageColdinks)

        img.alpha=0f
        img.animate().setDuration(2000).alpha(1f).withEndAction {
            startActivity(Intent(this,OnBoardingOne::class.java))
            finish()
        }
    }
}