package com.adriandevs.aitorlunaproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adriandevs.aitorlunaproject.databinding.ActivityIntentBinding

class IntentActivity:AppCompatActivity() {

    private lateinit var binding: ActivityIntentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun configButton(){

    }
}