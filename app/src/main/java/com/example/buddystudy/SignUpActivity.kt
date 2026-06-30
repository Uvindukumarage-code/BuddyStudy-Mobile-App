package com.example.buddystudy

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val etFullName = findViewById<EditText>(R.id.et_full_name)
        val etEmail = findViewById<EditText>(R.id.et_email)
        val etPassword = findViewById<EditText>(R.id.et_password)
        val etConfirmPassword = findViewById<EditText>(R.id.et_confirm_password)
        val cbTerms = findViewById<CheckBox>(R.id.cb_terms)
        val btnCreateAccount = findViewById<Button>(R.id.btn_create_account)
        val tvSignIn = findViewById<TextView>(R.id.tv_sign_in)

        // Sign In ලින්ක් එක ක්ලික් කළ විට Login තිරයට යාම
        tvSignIn.setOnClickListener {
            finish()
        }

        btnCreateAccount.setOnClickListener {
            val name = etFullName.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val pass = etPassword.text.toString()
            val confirmPass = etConfirmPassword.text.toString()

            if (name.isEmpty() || email.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else if (pass != confirmPass) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            } else if (!cbTerms.isChecked) {
                Toast.makeText(this, "Please agree to the Terms", Toast.LENGTH_SHORT).show()
            } else {
                // Save name to SharedPreferences
                val sharedPref = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE)
                with(sharedPref.edit()) {
                    putString("USER_NAME", name)
                    putString("USER_EMAIL", email)
                    apply()
                }

                // සාර්ථක නම් Home Screen එකට යාම
                val intent = Intent(this, HomeActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)
            }
        }
    }
}