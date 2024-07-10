package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.wezeshaapplication.databinding.ActivityHamburgerMenuBinding
import com.akirachix.wezeshaapplication.databinding.ActivityMilkRecordsBinding

class MilkRecords : AppCompatActivity() {

    lateinit var  binding: ActivityMilkRecordsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMilkRecordsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.arrowback.setOnClickListener {
            val intent = Intent(this, LandingPage::class.java)
            startActivity(intent)
        }

        binding.tvPayment.setOnClickListener {
            val intent = Intent(this, MilkRecordings::class.java)
            startActivity(intent)
        }


    }
}