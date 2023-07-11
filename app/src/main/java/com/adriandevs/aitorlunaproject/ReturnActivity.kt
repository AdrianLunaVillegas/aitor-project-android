package com.adriandevs.aitorlunaproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adriandevs.aitorlunaproject.common.KeyConstants.ExtraName
import com.adriandevs.aitorlunaproject.databinding.ActivityReturnBinding

class ReturnActivity : AppCompatActivity() {

    private lateinit var binding: ActivityReturnBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReturnBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configMainButton()
        configNextButton()
    }

    private fun configMainButton() {
        binding.btnMain.setOnClickListener {
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
        }
    }

    private fun configNextButton() {
        binding.btnNext.setOnClickListener {
            val cadena = binding.etCadena.text.toString()
            val intent = Intent(this, FinalActivity::class.java)
            intent.putExtra(ExtraName, cadena)
            startActivity(intent)
        }
    }
}