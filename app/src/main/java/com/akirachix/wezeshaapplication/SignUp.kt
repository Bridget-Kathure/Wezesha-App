package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.wezeshaapplication.databinding.ActivityMainBinding
import com.akirachix.wezeshaapplication.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.tvHaveAccount.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.btnSignup.setOnClickListener {
            validateSignUp()
        }
    }


    fun validateSignUp() {
        var formErr = false
        val firstName = binding.tvFirstname.text.toString()
        if (firstName.isBlank()) {
            formErr = true
            binding.tilFirstname.error = "First name is required"
        }

        val surName = binding.tvSurName.text.toString()
        if (surName.isBlank()) {
            formErr = true
            binding.tilSurname.error = "Surname is required"
        }

        val coopId = binding.tvId.text.toString()
        if (coopId.isBlank()) {
            formErr = true
            binding.tilCoopID.error = "Cooperative ID is required"
        }

        val phonenumber = binding.tvPhoneNumber.text.toString()
        if (phonenumber.isBlank()) {
            formErr = true
            binding.tilPhoneNumber.error = "A codeHive ID is required"
        }

        val password = binding.tvSignupPassword.text.toString()
        if (password.isBlank()) {
            formErr = true
            binding.tilPassword.error = "Password is required"
        }
        val passwordConf = binding.tvConfirm.text.toString()
        if(passwordConf.isBlank()) {
            formErr = true
            binding.tilConfirmPassword.error = "Password confirmation is required"
        }
        if(password != passwordConf){
            formErr = true
            binding.tilConfirmPassword.error = "password does not match"
        }
        if(!formErr){
            // proceed to registration
        }


        fun clearErrors(){
            binding.tilFirstname.error = null
            binding.tilSurname.error = null
            binding.tilPhoneNumber.error = null
            binding.tilCoopID.error = null
            binding.tilPassword.error = null
            binding.tilConfirmPassword.error = null
        }
    }
}
