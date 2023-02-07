package com.example.drinkyours

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.regex.Matcher
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var mail: EditText
    lateinit var password: EditText
    lateinit var button2: Button
    lateinit var text:TextView
    lateinit var text2:TextView
    lateinit var txtfor:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.btnlogin)
        mail = findViewById(R.id.etmobile)
        password = findViewById(R.id.etpassword)
        button2 = findViewById(R.id.btn_log_save)
        text=findViewById(R.id.txtstore)
        text2=findViewById(R.id.txtstore1)
        txtfor=findViewById(R.id.etforgot)



        val CustamerDetails = getSharedPreferences("CustamerData", MODE_PRIVATE)
        button.setOnClickListener {
            val cus_mail = mail.text.toString()
            val cus_pass = password.text.toString()
            CustamerDetails.edit().putString("stuname", cus_mail).apply()
            CustamerDetails.edit().putString("sturoll", cus_pass).apply()
        }

        button2.setOnClickListener {
//            startActivity(Intent(this,Navigations::class.java))
            val custa_mail = CustamerDetails.getString("custamer mail", "vjita22@gmail.com")
            val custa_password = CustamerDetails.getString("custamer password", "9876543210")

            text.text = custa_mail
            text2.text = custa_password

            startActivity(Intent(this,BottomNavigation::class.java))

        }
        txtfor.setOnClickListener() {
            startActivity(Intent(this,Signuppage::class.java))
        }
    }

}
//        button2.setOnClickListener() {
//            if (mobile.text.isNotEmpty() && password.text.isNotEmpty()) {
//                if (isEmailValid(mobile.text.toString().trim()) && (password.text.length >= 4))
//                    startActivity(Intent(this, Registration::class.java)
//                            .putExtra("Enter your mail id", mobile.text.toString())
//                            .putExtra("Enter pass word", password.text.toString())
//                    )
//                else {
//                    Toast.makeText(this, "Enter falid password", Toast.LENGTH_SHORT).show()
//                }
//            } else {
//                mobile.error = "enter correct email"
//                password.error = "enter correct password"
//            }
//        }
//    }
//
//    private fun isEmailValid(usermail: String?): Boolean {
//        val expression_name = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"
//        val pattern_name: Pattern = Pattern.compile(expression_name, Pattern.CASE_INSENSITIVE)
//        val matcher_name: Matcher = pattern_name.matcher(usermail.toString())
//        return matcher_name.matches()
//    }

