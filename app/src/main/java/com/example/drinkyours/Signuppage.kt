package com.example.drinkyours

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Signuppage : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var email: EditText
    lateinit var mobile: EditText
    lateinit var delivery: EditText
    lateinit var password: EditText
    lateinit var confirm: EditText
    lateinit var button: Button
    lateinit var button2: Button
    lateinit var text1: TextView
    lateinit var text2: TextView
    lateinit var text3: TextView
    lateinit var text4: TextView
    lateinit var text5: TextView
    lateinit var text6: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signuppage)

        name = findViewById(R.id.etname)
        email = findViewById(R.id.etmail)
        mobile = findViewById(R.id.etmobile)
        delivery = findViewById(R.id.etdelivery)
        password = findViewById(R.id.etpass)
        confirm = findViewById(R.id.etconfirm)
        button = findViewById(R.id.btnregister)
        button2=findViewById(R.id.btnregistsave)
        text1=findViewById(R.id.txt)
        text2=findViewById(R.id.txt1)
        text3=findViewById(R.id.txt2)
        text4=findViewById(R.id.txt3)
        text5=findViewById(R.id.txt4)
        text6=findViewById(R.id.txt5)

        button.setOnClickListener() {
            val CustamerDetails = getSharedPreferences("CustamerData", MODE_PRIVATE)
            button.setOnClickListener {
                val cus_name = name.text.toString()
                val cus_email = email.text.toString()
                val cus_mobile = mobile.text.toString()
                val cus_deliery = delivery.text.toString()
                val cus_pass = password.text.toString()
                val cus_confirm = confirm.text.toString()
                CustamerDetails.edit().putString("custamer_name", cus_name).apply()
                CustamerDetails.edit().putString("custamer_mail", cus_email).apply()
                CustamerDetails.edit().putString("custamer_mobile", cus_mobile).apply()
                CustamerDetails.edit().putString("custamer_delivery", cus_deliery).apply()
                CustamerDetails.edit().putString("custamer_password", cus_pass).apply()
                CustamerDetails.edit().putString("custamer_confirm", cus_confirm).apply()
            }

            button2.setOnClickListener {
                val custa_name = CustamerDetails.getString("custamer_name", "Vijitha")
                val custa_email = CustamerDetails.getString("custamer_mail", "vijitha@gmail.com")
                val custa_mobile = CustamerDetails.getString("custamer_mobile", "9876543210")
                val custa_delivery = CustamerDetails.getString("custamer_delivery", "sarjapur")
                val custa_password = CustamerDetails.getString("custamer_password", "123456")
                val custa_confirm = CustamerDetails.getString("custamer_confirm", "0")


                text1.text = custa_name
                text2.text = custa_email
                text3.text = custa_mobile
                text4.text = custa_delivery
                text5.text = custa_password
                text5.text = custa_confirm
                startActivity(Intent(this, BottomNavigation::class.java))
            }
        }
    }
}