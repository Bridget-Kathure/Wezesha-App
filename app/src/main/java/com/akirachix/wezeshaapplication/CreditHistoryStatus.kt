package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.wezeshaapplication.databinding.ActivityCreditHistoryStatusBinding

class CreditHistoryStatus : AppCompatActivity() {
    lateinit var binding: ActivityCreditHistoryStatusBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreditHistoryStatusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivArrow3.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
//            startActivity(intent)
        }

        binding.tvLoans.setOnClickListener {
                startActivity(Intent(this, CreditHistoryActiveLoans::class.java))
//                startActivity(intent)

        }

        binding.tvStatement.setOnClickListener {
            startActivity(Intent(this, CreditHistoryStatement::class.java))
//            startActivity(intent)

        }
    }
}
