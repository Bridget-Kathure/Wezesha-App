package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.wezeshaapplication.databinding.ActivityLoginBinding
import com.google.android.material.textfield.TextInputEditText

class Login<TextInputLayout> : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvAccount.setOnClickListener {
            startActivity(Intent(this, SignUp::class.java))
        }

        binding.btnLogin.setOnClickListener {
            validateLogin()
        }

        binding.etID.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                val coopid = s.toString()
                if (coopid.isNotEmpty() && !coopid.matches(Regex("\\d+"))) {
                    binding.tilInput2.error = "Please enter only integers"
                } else {
                    binding.tilInput2.error = null
                }
            }

        })


        binding.etFullNames.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                val firstName = s.toString()
                if (firstName.isNotEmpty() && !firstName.matches(Regex("[a-zA-Z\\s]+"))) {
                    binding.tilInput1.error = "Please enter only letters and spaces"
                } else {
                    binding.tilInput1.error = null
                }
            }
        })

        binding.etPassword.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                val password = s.toString()
                if (password.isNotEmpty() && !password.matches(Regex("^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z\\d]+\$"))) {
                    binding.tilInput3.error = "Password must contain at least one letter and one number"
                } else {
                    binding.tilInput3.error = null
                }
            }
        })
    }



    fun validateLogin() {
        var formErr = false
        val fullnames = binding.etFullNames.text.toString()
        if (fullnames.isBlank()) {
            formErr = true
            binding.tilInput1.error = "Fullnames required"
        }

        val cooperativeID = binding.etID.text.toString()
        if (cooperativeID.isBlank()) {
            formErr = true
            binding.tilInput2.error = "Cooperative ID is required"
        }

        if (!formErr) {
            performRegistration(
                fullnames,
                cooperativeID
            )
        }

    }

    fun clearErrors(){
        binding.tilInput1.error = null
        binding.tilInput2.error = null

    }

    private fun performRegistration(
        fullnames: String,
        cooperativeID: String

    ) {



        val intent = Intent(this, LandingPage::class.java)
        startActivity(intent)
    }

}

private fun TextInputEditText.addTextChangedListener(any: Any) {

}
