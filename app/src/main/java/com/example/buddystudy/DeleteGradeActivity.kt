package com.example.buddystudy

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class DeleteGradeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete_grade)

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
            // Logic to delete the grade record
            Toast.makeText(this, "Grade record deleted successfully", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}