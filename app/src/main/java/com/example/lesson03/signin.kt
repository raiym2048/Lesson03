package com.example.lesson03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
    }
    fun toscreen(view: android.view.View){
        val intent = Intent(this, screenMain::class.java)
        startActivity(intent)
    }
    fun tosignup(view: android.view.View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}