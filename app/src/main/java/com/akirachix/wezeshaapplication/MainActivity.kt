package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.wezeshaapplication.databinding.ActivityMainBinding

class MainActivity<TextInputLayout> : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvAccount.setOnClickListener {
            startActivity(Intent(this, SignUp::class.java))
        }

        binding.btnLogin.setOnClickListener {
            validateLogin()
        }

    }



    fun validateLogin() {
        var formErr = false
        val firstName = binding.tvFullNames.text.toString()
        if (firstName.isBlank()) {
            formErr = true
            binding.tilInput1.error = "Fullnames required"
        }

        val cooperativeID = binding.tvID.text.toString()
        if (cooperativeID.isBlank()) {
            formErr = true
            binding.tilInput2.error = "Cooperative ID is required"
        }

    }

    fun clearErrors(){
        binding.tilInput1.error = null
        binding.tilInput2.error = null

    }


}