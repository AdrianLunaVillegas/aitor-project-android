package com.adriandevs.aitorlunaproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adriandevs.aitorlunaproject.databinding.ActivityWelcomeBinding


class WelcomeActivity: AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configButton()
    }


    private fun configButton(){
        binding.enterbtn2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}