package com.example.buddystudy

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class DeleteDoubtActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete_doubt)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val btnConfirmDelete = findViewById<MaterialButton>(R.id.btnConfirmDelete)
        val btnCancel = findViewById<MaterialButton>(R.id.btnCancel)

        btnBack.setOnClickListener {
            finish()
        }

        btnCancel.setOnClickListener {
            finish()
        }

        btnConfirmDelete.setOnClickListener {
            // Logic to delete the doubt record
            Toast.makeText(this, "Doubt deleted successfully", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}