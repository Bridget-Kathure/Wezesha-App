package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.wezeshaapplication.databinding.ActivitySignUpBinding
import com.akirachix.wezeshaapplication.databinding.ActivitySuccessBinding

class Success : AppCompatActivity() {
    lateinit var binding: ActivitySuccessBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySuccessBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMessage.setOnClickListener {
            val intent = Intent(this, LandingPage::class.java)
            startActivity(intent)
        }
    }}