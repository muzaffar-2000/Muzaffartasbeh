package com.example.muzaffartasbeh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.muzaffartasbeh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.zikirlar.setOnClickListener {
            startActivity(Intent(this,zikirlaruchun::class.java))
        }
        setContentView(binding.root)
        binding.tasbeh.setOnClickListener {
            startActivity(Intent(this,TasbehUchun::class.java))
        }
    }
}