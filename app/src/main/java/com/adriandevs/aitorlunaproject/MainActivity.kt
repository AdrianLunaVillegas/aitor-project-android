package com.adriandevs.aitorlunaproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.adriandevs.aitorlunaproject.common.setSingleClickListener
import com.adriandevs.aitorlunaproject.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configButton()
        configButton2()
    }
    private fun configButton() {
        binding.btnLogin.setSingleClickListener{
            val intent = Intent (this, MenuActivity::class.java )
            startActivity(intent)
        }
    }
    private fun configButton2() {
        binding.btnReturn.setOnClickListener {
            val intent = Intent ( this, WelcomeActivity::class.java)
            startActivity(intent)
        }
    }


}