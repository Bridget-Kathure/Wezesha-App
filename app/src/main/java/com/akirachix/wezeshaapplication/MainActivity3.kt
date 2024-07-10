package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.wezeshaapplication.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
        lateinit var binding: ActivityMain3Binding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMain3Binding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.ivArrow2.setOnClickListener {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)

            }

            binding.textView13.setOnClickListener {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }

            binding.textView8.setOnClickListener {
                val intent = Intent(this, TransactionList::class.java)
                startActivity(intent)
            }
        }
    }