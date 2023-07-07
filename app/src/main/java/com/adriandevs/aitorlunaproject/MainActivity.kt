package com.adriandevs.aitorlunaproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.adriandevs.aitorlunaproject.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val myButton = findViewById<Button>(R.id.myButton)
        myButton.setSingleClickListener{
            val intent = Intent (this, MenuActivity::class.java )
            startActivity(intent)
        }
    }


    fun View.setSingleClickListener(onClick: () -> Unit) {
        var lastClickTime = 0L
        val delayMillis = 5000L //tiempo minimo entre clics ( en Milisegundos ) 5 segundos actualmente

        this.setOnClickListener {
            val currenTime = System.currentTimeMillis()
            if(currenTime - lastClickTime > delayMillis) {
                lastClickTime = currenTime
                onClick()
            }
        }
    }
}