package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.wezeshaapplication.databinding.ActivityMainBinding
import com.akirachix.wezeshaapplication.databinding.ActivityMilkRecordingsBinding

class MilkRecordings : AppCompatActivity() {
    lateinit var binding: ActivityMilkRecordingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMilkRecordingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backArrow.setOnClickListener {
            val intent = Intent(this, LandingPage::class.java)
            startActivity(intent)
        }
}

}
