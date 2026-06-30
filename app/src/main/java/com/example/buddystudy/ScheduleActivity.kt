package com.example.buddystudy

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ScheduleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)

        // Find edit buttons and set click listeners
        val btnEdit1 = findViewById<ImageView>(R.id.btnEdit1)
        val btnEdit2 = findViewById<ImageView>(R.id.btnEdit2)
        val btnEdit3 = findViewById<ImageView>(R.id.btnEdit3)
        val btnEdit4 = findViewById<ImageView>(R.id.btnEdit4)

        val editClickListener = {
            val intent = Intent(this, EditSessionActivity::class.java)
            startActivity(intent)
        }

        btnEdit1?.setOnClickListener { editClickListener() }
        btnEdit2?.setOnClickListener { editClickListener() }
        btnEdit3?.setOnClickListener { editClickListener() }
        btnEdit4?.setOnClickListener { editClickListener() }

        // Find delete buttons and set click listeners
        val btnDelete1 = findViewById<ImageView>(R.id.btnDelete1)
        val btnDelete2 = findViewById<ImageView>(R.id.btnDelete2)
        val btnDelete3 = findViewById<ImageView>(R.id.btnDelete3)
        val btnDelete4 = findViewById<ImageView>(R.id.btnDelete4)

        val deleteClickListener = {
            val intent = Intent(this, DeleteSessionActivity::class.java)
            startActivity(intent)
        }

        btnDelete1?.setOnClickListener { deleteClickListener() }
        btnDelete2?.setOnClickListener { deleteClickListener() }
        btnDelete3?.setOnClickListener { deleteClickListener() }
        btnDelete4?.setOnClickListener { deleteClickListener() }

        // Find FAB and set click listener
        val fabAddSchedule = findViewById<FloatingActionButton>(R.id.fabAddSchedule)
        fabAddSchedule.setOnClickListener {
            val intent = Intent(this, AddScheduleActivity::class.java)
            startActivity(intent)
        }

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomNav.selectedItemId = R.id.nav_schedule

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, HomeActivity::class.java))
                    finish()
                    true
                }
                R.id.nav_schedule -> true
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