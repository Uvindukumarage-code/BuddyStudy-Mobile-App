package com.example.buddystudy

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class AddScheduleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_schedule)

        val btnClose = findViewById<ImageView>(R.id.btnClose)
        val btnCancel = findViewById<MaterialButton>(R.id.btnCancel)
        val btnSave = findViewById<MaterialButton>(R.id.btnSave)

        btnClose.setOnClickListener {
            finish()
        }

        btnCancel.setOnClickListener {
            finish()
        }

        btnSave.setOnClickListener {
            // Logic to save the schedule can be added here
            finish()
        }
    }
}