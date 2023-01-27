package com.example.drinkyours

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val img:ImageView=findViewById(R.id.imageColdinks)
        val txt:TextView=findViewById(R.id.txt)

        img.alpha=0f
        img.animate().setDuration(2000).alpha(1f).withEndAction {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}