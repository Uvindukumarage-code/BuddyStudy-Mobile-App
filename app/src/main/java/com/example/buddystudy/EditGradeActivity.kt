package com.example.buddystudy

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class EditGradeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_grade)

        val btnClose = findViewById<ImageView>(R.id.btnClose)
        val btnUpdate = findViewById<MaterialButton>(R.id.btnUpdate)
        val btnCancel = findViewById<MaterialButton>(R.id.btnCancel)

        btnClose.setOnClickListener {
            finish()
        }

        btnCancel.setOnClickListener {
            finish()
        }

        btnUpdate.setOnClickListener {
            // Logic to update the grade
            Toast.makeText(this, "Grade updated successfully", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}