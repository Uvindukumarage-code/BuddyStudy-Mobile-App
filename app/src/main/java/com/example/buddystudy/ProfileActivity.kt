package com.example.buddystudy

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btnBack = findViewById<ImageButton>(R.id.btn_back)
        val btnCreateProfile = findViewById<MaterialButton>(R.id.btn_create_profile)
        val btnEditProfile = findViewById<MaterialButton>(R.id.btn_edit_profile)
        val btnDeleteAccount = findViewById<MaterialButton>(R.id.btn_delete_account)
        val tvProfileName = findViewById<TextView>(R.id.profile_name)
        val tvProfileEmail = findViewById<TextView>(R.id.profile_email)

        // Retrieve data from SharedPreferences
        val sharedPref = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE)
        val savedName = sharedPref.getString("USER_NAME", "John Doe")
        val savedEmail = sharedPref.getString("USER_EMAIL", "johndoe@example.com")

        // Update UI with saved data
        tvProfileName.text = savedName
        tvProfileEmail.text = savedEmail

        btnBack.setOnClickListener {
            finish()
        }

        btnCreateProfile.setOnClickListener {
            startActivity(Intent(this, CreateProfileActivity::class.java))
        }

        btnEditProfile.setOnClickListener {
            startActivity(Intent(this, EditProfileActivity::class.java))
        }

        btnDeleteAccount.setOnClickListener {
            startActivity(Intent(this, DeleteProfileActivity::class.java))
        }
    }
}