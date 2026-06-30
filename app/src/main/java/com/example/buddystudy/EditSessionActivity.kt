package com.example.buddystudy

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class EditSessionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_session)

        val btnClose = findViewById<ImageView>(R.id.btnClose)
        val btnCancel = findViewById<MaterialButton>(R.id.btnCancel)
        val btnUpdate = findViewById<MaterialButton>(R.id.btnUpdate)

        btnClose.setOnClickListener {
            finish()
        }

        btnCancel.setOnClickListener {
            finish()
        }

        btnUpdate.setOnClickListener {
            // Logic to update the session can be added here
            finish()
        }
    }
}