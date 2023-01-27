package com.example.drinkyours

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.regex.Matcher
import java.util.regex.Pattern

class Loginpage : AppCompatActivity() {
    lateinit var button: Button
    lateinit var mobile: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)

        button = findViewById(R.id.btnlogin)
        mobile = findViewById(R.id.etmobile)
        password = findViewById(R.id.etpassword)
        button.setOnClickListener() {
            if (mobile.text.isNotEmpty() && password.text.isNotEmpty()) {
                if (isEmailValid(mobile.text.toString().trim()) && (password.text.length >= 4))
                    startActivity(Intent(this, Signuppage::class.java)
                        .putExtra("Enter your mail id", mobile.text.toString())
                        .putExtra("Enter pass word", password.text.toString()))
                    else {
                        Toast.makeText(this, "Enter falid password", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    mobile.error = "enter correct email"
                    password.error = "enter correct password"
                }
            }
        }
        private fun isEmailValid(usermail: String?): Boolean {
            val expression_name = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"
            val pattern_name: Pattern = Pattern.compile(expression_name, Pattern.CASE_INSENSITIVE)
            val matcher_name: Matcher = pattern_name.matcher(usermail.toString())
            return matcher_name.matches()
        }
    }


