package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.wezeshaapplication.databinding.ActivityTransactionsExpensesBinding

class TransactionsExpenses : AppCompatActivity() {
        lateinit var binding: ActivityTransactionsExpensesBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityTransactionsExpensesBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.textView4.setOnClickListener {
                val intent = Intent(this, TransactionsProfit::class.java)
                startActivity(intent)

            }

            binding.tvExarrow.setOnClickListener {
                val intent = Intent(this, TransactionList::class.java)
                startActivity(intent)

            }

            binding.textView2.setOnClickListener {
                val intent = Intent(this, TransactionList::class.java)
                startActivity(intent)
            }
        }
    }
