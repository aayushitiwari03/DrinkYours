package com.example.drinkyours.onBording

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.drinkyours.MainActivity
import com.example.drinkyours.R

class OnBordingThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_bording_three)

        var finish:TextView=findViewById(R.id.finish)

        finish.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}