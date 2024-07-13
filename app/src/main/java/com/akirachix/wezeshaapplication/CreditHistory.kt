package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.wezeshaapplication.databinding.ActivityCreditHistoryBinding

class CreditHistory : AppCompatActivity() {

    lateinit var binding: ActivityCreditHistoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreditHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backArrow.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.tvActiveLoans2.setOnClickListener {
            startActivity(Intent(this, MainActivity5::class.java))
        }


        binding.tvBorrower2.setOnClickListener {
            startActivity(Intent(this, MainActivity4::class.java))
        }
    }

}

