package com.adriandevs.aitorlunaproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adriandevs.aitorlunaproject.databinding.ActivityRevolutionBinding

class RevolutionActivity: AppCompatActivity(){

    private lateinit var binding: ActivityRevolutionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRevolutionBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }


}