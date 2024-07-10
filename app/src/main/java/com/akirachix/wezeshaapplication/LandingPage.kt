package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.wezeshaapplication.databinding.ActivityHamburgerMenuBinding
import com.akirachix.wezeshaapplication.databinding.ActivityLandingPageBinding
import com.akirachix.wezeshaapplication.databinding.ActivityMainBinding

class LandingPage : AppCompatActivity() {
    lateinit var binding: ActivityLandingPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvMenu.setOnClickListener {
            val intent = Intent(this, HamburgerMenu::class.java)
            startActivity(intent)
        }

        binding.tvTransactions.setOnClickListener {
            val intent = Intent(this, TransactionList::class.java)
            startActivity(intent)
        }

        binding.tvCredit.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }


        binding.tvRecordstext.setOnClickListener {
            val intent = Intent(this, MilkRecords::class.java)
            startActivity(intent)
        }

    }
}