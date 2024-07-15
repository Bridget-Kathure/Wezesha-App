package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.wezeshaapplication.databinding.ActivityHamburgerMenuBinding

class HamburgerMenu : AppCompatActivity() {

    lateinit var  binding: ActivityHamburgerMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityHamburgerMenuBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvClose.setOnClickListener {
            startActivity(Intent(this, LandingPage::class.java))
        }

        binding.firstTextView.setOnClickListener {
            val intent = Intent(this, LandingPage::class.java)
            startActivity(intent)
        }

        binding.tvLogOut.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }

        binding.tvFeedback.setOnClickListener {
            val intent = Intent(this, Feedback::class.java)
            startActivity(intent)
        }

        binding.tvMilkRecords.setOnClickListener {
            val intent = Intent(this, MilkRecordsProduction::class.java)
            startActivity(intent)
        }

        binding.tvTransactionss.setOnClickListener {
            val intent = Intent(this, TransactionList::class.java)
            startActivity(intent)
        }


    }
}