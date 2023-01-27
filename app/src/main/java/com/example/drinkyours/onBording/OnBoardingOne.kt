package com.example.drinkyours.onBording

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.drinkyours.MainActivity
import com.example.drinkyours.R

class OnBoardingOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_bording_one)

        val skip:TextView=findViewById(R.id.skip1)
        val next1:TextView=findViewById(R.id.next)

        skip.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        next1.setOnClickListener {
            val intent=Intent(this,OnBordingTwo::class.java)
            startActivity(intent)
            finish()
        }

    }
}