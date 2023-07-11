package com.adriandevs.aitorlunaproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adriandevs.aitorlunaproject.databinding.ActivityLunaBinding

class LunaActivity:AppCompatActivity() {

    private lateinit var binding: ActivityLunaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLunaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}