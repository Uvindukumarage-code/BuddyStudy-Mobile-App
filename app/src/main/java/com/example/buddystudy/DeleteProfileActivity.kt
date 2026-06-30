package com.example.buddystudy

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class DeleteProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete_profile)

        val btnBack = findViewById<ImageButton>(R.id.btn_back)
        val btnConfirmDelete = findViewById<MaterialButton>(R.id.btn_confirm_delete)
        val btnCancel = findViewById<MaterialButton>(R.id.btn_cancel)

        btnBack.setOnClickListener {
            finish()
        }

        btnCancel.setOnClickListener {
            finish()
        }

        btnConfirmDelete.setOnClickListener {
            // Handle actual deletion logic here
            Toast.makeText(this, "Profile Deleted Successfully", Toast.LENGTH_SHORT).show()
            
            // Redirect to Login or Main Activity after deletion
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }
}