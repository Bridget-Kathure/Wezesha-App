package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.wezeshaapplication.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
        lateinit var binding: ActivityMain2Binding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMain2Binding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.textView4.setOnClickListener {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)

            }

            binding.tvExarrow.setOnClickListener {
                val intent = Intent(this, TransactionList::class.java)
                startActivity(intent)

            }

            binding.textView2.setOnClickListener {
                val intent = Intent(this, TransactionList::class.java)
                startActivity(intent)
            }
        }
    }
