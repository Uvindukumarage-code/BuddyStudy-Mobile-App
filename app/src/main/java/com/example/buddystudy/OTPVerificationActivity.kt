package com.example.buddystudy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OTPVerificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_verification)

        val ivBack = findViewById<ImageView>(R.id.iv_back)
        val btnVerify = findViewById<Button>(R.id.btn_verify)
        val tvResend = findViewById<TextView>(R.id.tv_resend)

        ivBack.setOnClickListener {
            finish()
        }

        btnVerify.setOnClickListener {
            // Navigate to Reset Password Screen
            val intent = Intent(this, ResetPasswordActivity::class.java)
            startActivity(intent)
        }

        tvResend.setOnClickListener {
            // Resend OTP logic here
        }
    }
}