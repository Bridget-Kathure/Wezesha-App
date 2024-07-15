package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.akirachix.wezeshaapplication.databinding.ActivityCreditHistoryBinding

class CreditHistory : AppCompatActivity() {

    lateinit var binding: ActivityCreditHistoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreditHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvMain.layoutManager = LinearLayoutManager(this)
        creditHistoryList()
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
    fun creditHistoryList() {
        val history1 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history2 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history3 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history4 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history5 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history6 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history7 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history8 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history9 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history14 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history11 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history12 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history13 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history15 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history16 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history17 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history18 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history19 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history20 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history21 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history10 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history22 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history23 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history24 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history25 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history26 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history27 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history28 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history29 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val history30 = Credit(
            "10/1/2024", "2/12/2023", "3/10/2024"
        )
        val myHistories = listOf(history1,history2,history3,history4,history5,
            history6,history7,history8,history9,history10,history11,history12,history13,history14,
            history15,history16,history17,history18,history19,history20,history21,history22,history23,
            history24,history25,history26,history27,history29,history30)
        val creditAdapter = CreditAdapter(myHistories)
        binding.rvMain.adapter = creditAdapter

    }
}


