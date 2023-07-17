package com.adriandevs.aitorlunaproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adriandevs.aitorlunaproject.common.KeyConstants.ExtraName
import com.adriandevs.aitorlunaproject.common.setSingleClickListener
import com.adriandevs.aitorlunaproject.databinding.ActivityFinalBinding

class FinalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFinalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialize()
    }

    private fun initialize() {
        getIntentExtra()
        configButton()
    }

    private fun getIntentExtra() {
        val stringReceived = intent.getStringExtra(ExtraName)
        binding.tvStringReceived.setText(stringReceived.orEmpty())
    }

    private fun configButton() {
        binding.btnPress.setSingleClickListener {
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
        }
    }
}