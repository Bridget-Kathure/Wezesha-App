package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.wezeshaapplication.databinding.ActivityMilkRecordsProductionBinding

class MilkRecordsProduction : AppCompatActivity() {

    lateinit var  binding: ActivityMilkRecordsProductionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMilkRecordsProductionBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.arrowback.setOnClickListener {
            val intent = Intent(this, LandingPage::class.java)
            startActivity(intent)
        }

        binding.tvPayment.setOnClickListener {
            val intent = Intent(this, MilkRecordsPayments::class.java)
            startActivity(intent)
        }


    }
}