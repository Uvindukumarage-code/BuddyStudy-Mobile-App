package com.example.buddystudy

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DoubtsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doubts)

        // Create: Navigate to CreateDoubtActivity via FAB or Top Card Button
        val fabAddDoubt = findViewById<FloatingActionButton>(R.id.fabAddDoubt)
        val btnPostDoubt = findViewById<MaterialButton>(R.id.btnPostDoubt)

        val createClickListener = {
            val intent = Intent(this, CreateDoubtActivity::class.java)
            startActivity(intent)
        }
        fabAddDoubt.setOnClickListener { createClickListener() }
        btnPostDoubt.setOnClickListener { createClickListener() }

        // Read: Navigate to ReadDoubtActivity when clicking a doubt card
        val doubtCard1 = findViewById<MaterialCardView>(R.id.doubtCard1)
        val doubtCard2 = findViewById<MaterialCardView>(R.id.doubtCard2)

        val readClickListener = {
            val intent = Intent(this, ReadDoubtActivity::class.java)
            startActivity(intent)
        }
        doubtCard1.setOnClickListener { readClickListener() }
        doubtCard2.setOnClickListener { readClickListener() }

        // Edit: Direct navigation from list icons
        val btnEdit1 = findViewById<ImageView>(R.id.btnEdit1)
        val btnEdit2 = findViewById<ImageView>(R.id.btnEdit2)

        val editClickListener = {
            val intent = Intent(this, EditDoubtActivity::class.java)
            startActivity(intent)
        }
        btnEdit1.setOnClickListener { editClickListener() }
        btnEdit2.setOnClickListener { editClickListener() }

        // Delete: Direct navigation from list icons
        val btnDelete1 = findViewById<ImageView>(R.id.btnDelete1)
        val btnDelete2 = findViewById<ImageView>(R.id.btnDelete2)

        val deleteClickListener = {
            val intent = Intent(this, DeleteDoubtActivity::class.java)
            startActivity(intent)
        }
        btnDelete1.setOnClickListener { deleteClickListener() }
        btnDelete2.setOnClickListener { deleteClickListener() }

        // Bottom Navigation
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomNav.selectedItemId = R.id.nav_doubts

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, HomeActivity::class.java))
                    finish()
                    true
                }
                R.id.nav_doubts -> true
                R.id.nav_schedule -> {
                    startActivity(Intent(this, ScheduleActivity::class.java))
                    finish()
                    true
                }
                R.id.nav_grades -> {
                    startActivity(Intent(this, GradesActivity::class.java))
                    finish()
                    true
                }
                else -> false
            }
        }
    }
}