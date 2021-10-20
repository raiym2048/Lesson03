package com.example.lesson03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
    }
    fun signin(view: android.view.View){
        val intent = Intent(this,ScreenActivity::class.java)
        startActivity(intent)
    }
    fun register(view: android.view.View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}