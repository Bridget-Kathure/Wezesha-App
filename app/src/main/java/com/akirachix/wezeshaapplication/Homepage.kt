package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.wezeshaapplication.databinding.ActivityHomepageBinding
import com.akirachix.wezeshaapplication.databinding.ActivitySignUpBinding

class Homepage : AppCompatActivity() {

    lateinit var binding: ActivityHomepageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvClickLogin.setOnClickListener {
            startActivity(Intent(this, SignUp::class.java))
        }

        binding.btnGetStarted.setOnClickListener {
            startActivity(Intent(this, SignUp::class.java))
        }

    }
}