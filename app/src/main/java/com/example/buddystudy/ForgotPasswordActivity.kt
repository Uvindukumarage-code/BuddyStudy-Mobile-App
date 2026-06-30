package com.example.buddystudy

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val ivBack = findViewById<ImageView>(R.id.iv_back)
        val btnSendOtp = findViewById<Button>(R.id.btn_send_otp)
        val etEmail = findViewById<TextInputEditText>(R.id.et_email)
        val tilEmail = findViewById<TextInputLayout>(R.id.til_email)
        val tvSignIn = findViewById<TextView>(R.id.tv_remembered_signin)

        ivBack.setOnClickListener {
            finish()
        }

        tvSignIn.setOnClickListener {
            finish()
        }

        btnSendOtp.setOnClickListener {
            val email = etEmail.text.toString().trim()

            if (email.isEmpty()) {
                tilEmail.error = "Email address is required"
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                tilEmail.error = "Please enter a valid email address"
            } else {
                tilEmail.error = null // Clear error
                // Navigate to OTP Verification Screen
                val intent = Intent(this, OTPVerificationActivity::class.java)
                startActivity(intent)
            }
        }
    }
}