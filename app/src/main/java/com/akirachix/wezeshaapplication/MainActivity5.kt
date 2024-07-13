package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.wezeshaapplication.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    lateinit var binding:ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvStatements.setOnClickListener {
            startActivity(Intent(this, CreditHistory::class.java))
        }

        binding.tvBorrower.setOnClickListener {
            startActivity(Intent(this, MainActivity4::class.java))
        }
    }
}