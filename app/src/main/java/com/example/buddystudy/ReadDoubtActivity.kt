package com.example.buddystudy

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class ReadDoubtActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read_doubt)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val btnEdit = findViewById<ImageView>(R.id.btnEdit)
        val btnDelete = findViewById<MaterialButton>(R.id.btnDelete)

        btnBack.setOnClickListener {
            finish()
        }

        btnEdit.setOnClickListener {
            val intent = Intent(this, EditDoubtActivity::class.java)
            startActivity(intent)
        }

        btnDelete.setOnClickListener {
            val intent = Intent(this, DeleteDoubtActivity::class.java)
            startActivity(intent)
        }
    }
}