package com.adriandevs.aitorlunaproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.adriandevs.aitorlunaproject.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity(){



    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val enterBtn = findViewById<Button>(R.id.enterBtn)
        enterBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
             }
        }
    }