package com.example.drinkyours.onBording

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.drinkyours.MainActivity
import com.example.drinkyours.R

class OnBordingTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_bording_two)

        val skip2: TextView =findViewById(R.id.skip2)
        val next2: TextView =findViewById(R.id.next2)

        skip2.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        next2.setOnClickListener {
            val intent=Intent(this,OnBordingThree::class.java)
            startActivity(intent)
            finish()
        }
    }
}