package com.example.lesson03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var email:EditText
    lateinit var phone:EditText
    lateinit var password:EditText
    lateinit var repassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        email = findViewById(R.id.emailEditText)
        phone = findViewById(R.id.phoneEditText)
        password = findViewById(R.id.passwordEditText)
        repassword = findViewById(R.id.repasswordEditText)

    }
    fun signup(view: android.view.View){
        val emailIs = email.text.toString()
        val phoneIs = phone.text.toString()
        val passwordIs = password.text.toString()
        val repasswordIs = repassword.text.toString()

        if(emailIs.isBlank() || phoneIs.isBlank() || passwordIs.isBlank()
            || repasswordIs.isBlank() || !passwordIs.equals(repasswordIs)){
            Toast.makeText(this,"Поля заполнена неправильно!", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this,"Поздравляем! Вы зарегистрировались на наш сайт!", Toast.LENGTH_LONG).show()
            val intent = Intent(this, signin::class.java)
            startActivity(intent)
                //.show()
        }
    }
}