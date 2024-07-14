package com.akirachix.wezeshaapplication

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
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


        binding.etFirstname.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                val firstName = s.toString()
                if (firstName.isNotEmpty() && !firstName.matches(Regex("[a-zA-Z\\s]+"))) {
                    binding.tilFirstname.error = "Please enter only letters and spaces"
                } else {
                    binding.tilFirstname.error = null
                }
            }
        })


        binding.etSurname.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                val surname = s.toString()
                if (surname.isNotEmpty() && !surname.matches(Regex("[a-zA-Z\\s]+"))) {
                    binding.tilSurname.error = "Please enter only letters and spaces"
                } else {
                    binding.tilSurname.error = null
                }
            }
        })

        binding.etPhonenumber.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                val phoneNumber = s.toString()
                if (phoneNumber.isNotEmpty() && !phoneNumber.matches(Regex("\\d+"))) {
                    binding.tilPhoneNumber.error = "Please enter only numbers"
                } else {
                    binding.tilPhoneNumber.error = null
                }
            }
        })

        binding.etCoopId.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                val coopid = s.toString()
                if (coopid.isNotEmpty() && !coopid.matches(Regex("\\d+"))) {
                    binding.tilCoopID.error = "Please enter only integers"
                } else {
                    binding.tilCoopID.error = null
                }
            }
        })

        binding.etPassword.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                val password = s.toString()
                if (password.isNotEmpty() && !password.matches(Regex("^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z\\d]+\$"))) {
                    binding.tilPassword.error = "Password must contain at least one letter and one number"
                } else {
                    binding.tilPassword.error = null
                }
            }
        })
    }

    fun validateSignUp() {
        var formErr = false
        val firstName = binding.etFirstname.text.toString()
        if (firstName.isBlank() || !firstName.matches(Regex("[a-zA-Z\\s]+"))) {
            formErr = true
            binding.tilFirstname.error = "Please enter a valid first name (letters and spaces only)"
        }

        val surName = binding.etSurname.text.toString()
        if (surName.isBlank() || !surName.matches(Regex("[a-zA-Z\\s]+"))) {
            formErr = true
            binding.tilSurname.error = "Please enter a valid surname (letters and spaces only)"
        }

        val coopId = binding.etCoopId.text.toString()
        if (coopId.isBlank()) {
            formErr = true
            binding.tilCoopID.error = "Cooperative ID is required"
        }

        val phoneNumber = binding.etPhonenumber.text.toString()
        if (phoneNumber.isBlank()) {
            formErr = true
            binding.tilPhoneNumber.error = "A Phone number is required"
        }

        val password = binding.etPassword.text.toString()
        if (password.isBlank()) {
            formErr = true
            binding.tilPassword.error = "Password is required"
        }

        val passwordConfirmation = binding.etConfirmpassword.text.toString()
        if (passwordConfirmation.isBlank()) {
            formErr = true
            binding.tilConfirmPassword.error = "Password confirmation is required"
        }

        if (password != passwordConfirmation) {
            formErr = true
            binding.tilConfirmPassword.error = "Password does not match"
        }

        if (!formErr) {
            performRegistration(
                firstName,
                surName,
                coopId,
                phoneNumber,
                password,
                passwordConfirmation
            )
        }
    }

    fun clearErrors() {
        binding.tilFirstname.error = null
        binding.tilSurname.error = null
        binding.tilPhoneNumber.error = null
        binding.tilCoopID.error = null
        binding.tilPassword.error = null
        binding.tilConfirmPassword.error = null
    }

    private fun performRegistration(
        firstName: String,
        surName: String,
        coopId: String,
        phoneNumber: String,
        password: String,
        passwordConfirmation: String
    ) {
        val intent = Intent(this, LandingPage::class.java)
        startActivity(intent)
    }
}