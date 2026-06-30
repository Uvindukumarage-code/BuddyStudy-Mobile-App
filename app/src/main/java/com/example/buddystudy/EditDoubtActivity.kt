package com.example.buddystudy

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class EditDoubtActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_doubt)

        val btnClose = findViewById<ImageView>(R.id.btnClose)
        val btnUpdate = findViewById<MaterialButton>(R.id.btnUpdate)

        btnClose.setOnClickListener {
            finish()
        }

        btnUpdate.setOnClickListener {
            // Logic to update the doubt
            Toast.makeText(this, "Doubt updated successfully!", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}