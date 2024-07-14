package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.wezeshaapplication.databinding.ActivityFeedbackBinding
import com.akirachix.wezeshaapplication.databinding.ActivityHamburgerMenuBinding

class Feedback: AppCompatActivity() {

    lateinit var  binding: ActivityFeedbackBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityFeedbackBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvArrow.setOnClickListener {
            startActivity(Intent(this, LandingPage::class.java))
        }

        binding.btnSubmit.setOnClickListener {
            startActivity(Intent(this, Success::class.java))
        }



    }
}
