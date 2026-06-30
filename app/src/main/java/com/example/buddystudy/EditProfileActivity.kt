package com.example.buddystudy

import android.content.Context
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class EditProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val btnBack = findViewById<ImageButton>(R.id.btn_back)
        val btnUpdate = findViewById<MaterialButton>(R.id.btn_update)
        val etName = findViewById<TextInputEditText>(R.id.et_name)
        val etEmail = findViewById<TextInputEditText>(R.id.et_email)
        val etPhone = findViewById<TextInputEditText>(R.id.et_phone)
        val etBio = findViewById<TextInputEditText>(R.id.et_bio)

        // Load data from SharedPreferences
        val sharedPref = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE)
        val savedName = sharedPref.getString("USER_NAME", "")
        val savedEmail = sharedPref.getString("USER_EMAIL", "")
        val savedPhone = sharedPref.getString("USER_PHONE", "+94 77 123 4567")
        val savedBio = sharedPref.getString("USER_BIO", "Passionate learner and computer science student.")

        etName.setText(savedName)
        etEmail.setText(savedEmail)
        etPhone.setText(savedPhone)
        etBio.setText(savedBio)

        btnBack.setOnClickListener {
            finish()
        }

        btnUpdate.setOnClickListener {
            val name = etName.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val phone = etPhone.text.toString().trim()
            val bio = etBio.text.toString().trim()

            if (name.isNotEmpty() && email.isNotEmpty()) {
                // Save updated data to SharedPreferences
                with(sharedPref.edit()) {
                    putString("USER_NAME", name)
                    putString("USER_EMAIL", email)
                    putString("USER_PHONE", phone)
                    putString("USER_BIO", bio)
                    apply()
                }

                Toast.makeText(this, "Profile Updated Successfully", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}