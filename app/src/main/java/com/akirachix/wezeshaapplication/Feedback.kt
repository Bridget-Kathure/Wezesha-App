package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
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
            val feedback = binding.etFirstname.text.toString()
            val name = binding.etSurname.text.toString()
            val email = binding.etPhonenumber.text.toString()

            if (feedback.isEmpty() || name.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                startActivity(Intent(this, Success::class.java))
            }
        }



    }
}

