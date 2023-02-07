package com.example.drinkyours

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class OrderActivity2 : AppCompatActivity() {
    lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order2)
        button=findViewById(R.id.btnmoreok)
        button.setOnClickListener(){
            startActivity(Intent(this,BottomNavigation::class.java))
        }
    }
}