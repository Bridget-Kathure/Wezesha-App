package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.wezeshaapplication.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivArrow3.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            startActivity(intent)
        }
            binding.tvLoans.setOnClickListener {
                startActivity(Intent(this, MainActivity5::class.java))
                startActivity(intent)

        }

        binding.tvStatement.setOnClickListener {
            startActivity(Intent(this, CreditHistory::class.java))
            startActivity(intent)

        }
    }
}
