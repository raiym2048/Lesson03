package com.example.lesson03

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.lesson03.databinding.ActivityScreenMainBinding

class screenMain : AppCompatActivity() {

    private lateinit var binding: ActivityScreenMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScreenMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val avatar: ImageView = findViewById(R.id.avatar)
        val exit: TextView = findViewById(R.id.exit)
        exit.visibility = View.GONE
        val navView: BottomNavigationView = binding.navView
        navView.setOnNavigationItemSelectedListener { menu ->
            when(menu.itemId){
                R.id.navigation_notifications ->{
                    avatar.visibility = View.GONE
                    exit.visibility = View.VISIBLE}
                else -> {
                    avatar.visibility = View.VISIBLE
                    exit.visibility = View.GONE
                }
            }
            return@setOnNavigationItemSelectedListener false
        }

        navController = findNavController(R.id.nav_host_fragment_activity_screen_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        /*val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )*/
        //setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    fun profileClick(view: android.view.View) {
        navController.navigate(R.id.action_navigation_home_to_navigation_notifications)
    }
}