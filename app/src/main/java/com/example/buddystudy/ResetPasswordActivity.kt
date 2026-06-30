package com.example.buddystudy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ResetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        val ivBack = findViewById<ImageView>(R.id.iv_back)
        val btnResetPassword = findViewById<Button>(R.id.btn_reset_password)

        ivBack.setOnClickListener {
            finish()
        }

        btnResetPassword.setOnClickListener {
            // Navigate to Success Screen
            val intent = Intent(this, PasswordResetSuccessActivity::class.java)
            startActivity(intent)
        }
    }
}