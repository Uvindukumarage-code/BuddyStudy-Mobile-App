package com.example.buddystudy

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class CreateDoubtActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_doubt)

        val btnClose = findViewById<ImageView>(R.id.btnClose)
        val btnPost = findViewById<MaterialButton>(R.id.btnPost)

        btnClose.setOnClickListener {
            finish()
        }

        btnPost.setOnClickListener {
            // Logic to save the doubt
            Toast.makeText(this, "Doubt posted successfully!", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}