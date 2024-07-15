package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.wezeshaapplication.databinding.ActivityTransactionListBinding

class TransactionList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTransactionListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.arrowBack.setOnClickListener {
            val intent = Intent(this, LandingPage::class.java)
            startActivity(intent)
        }

        binding.tvExpenses.setOnClickListener {
            val intent = Intent(this, TransactionsExpenses::class.java)
            startActivity(intent)
        }

        binding.tvProfit.setOnClickListener {
            val intent = Intent(this, TransactionsProfit::class.java)
            startActivity(intent)
        }
    }
}