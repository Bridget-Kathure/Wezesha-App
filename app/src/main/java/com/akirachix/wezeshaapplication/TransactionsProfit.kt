package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.wezeshaapplication.databinding.ActivityTransactionsProfitBinding

class TransactionsProfit : AppCompatActivity() {
        lateinit var binding: ActivityTransactionsProfitBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityTransactionsProfitBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.ivArrow2.setOnClickListener {
                val intent = Intent(this, TransactionsExpenses::class.java)
                startActivity(intent)

            }

            binding.textView13.setOnClickListener {
                val intent = Intent(this, TransactionsExpenses::class.java)
                startActivity(intent)
            }

            binding.textView8.setOnClickListener {
                val intent = Intent(this, TransactionList::class.java)
                startActivity(intent)
            }
        }
    }