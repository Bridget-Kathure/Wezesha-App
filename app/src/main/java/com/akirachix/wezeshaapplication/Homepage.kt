package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.wezeshaapplication.databinding.ActivityHomepageBinding

class Homepage : AppCompatActivity() {

    lateinit var binding: ActivityHomepageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvClickLogin.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }

        binding.btnGetStarted.setOnClickListener {
            startActivity(Intent(this, SignUp::class.java))
        }

    }
}