package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.wezeshaapplication.databinding.ActivityMilkRecordsPaymentsBinding

class MilkRecordsPayments : AppCompatActivity() {
    lateinit var binding: ActivityMilkRecordsPaymentsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMilkRecordsPaymentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backArrow.setOnClickListener {
            val intent = Intent(this, LandingPage::class.java)
            startActivity(intent)
        }
}

}
