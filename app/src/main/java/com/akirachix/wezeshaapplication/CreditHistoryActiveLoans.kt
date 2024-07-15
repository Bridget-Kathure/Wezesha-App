package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.wezeshaapplication.databinding.ActivityCreditHistoryActiveLoansBinding

class CreditHistoryActiveLoans : AppCompatActivity() {
    lateinit var binding: ActivityCreditHistoryActiveLoansBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreditHistoryActiveLoansBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvStatements.setOnClickListener {
            startActivity(Intent(this, CreditHistoryStatement::class.java))
        }

        binding.tvBorrower.setOnClickListener {
            startActivity(Intent(this, CreditHistoryStatus::class.java))
        }



    }
}