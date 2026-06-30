package com.example.buddystudy

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class GradesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grades)

        // Find edit buttons and set click listeners
        val btnEdit1 = findViewById<ImageView>(R.id.btnEdit1)
        val btnEdit2 = findViewById<ImageView>(R.id.btnEdit2)
        val btnEdit3 = findViewById<ImageView>(R.id.btnEdit3)
        val btnEdit4 = findViewById<ImageView>(R.id.btnEdit4)

        val editClickListener = {
            val intent = Intent(this, EditGradeActivity::class.java)
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
            val intent = Intent(this, DeleteGradeActivity::class.java)
            startActivity(intent)
        }

        btnDelete1?.setOnClickListener { deleteClickListener() }
        btnDelete2?.setOnClickListener { deleteClickListener() }
        btnDelete3?.setOnClickListener { deleteClickListener() }
        btnDelete4?.setOnClickListener { deleteClickListener() }

        // Find FAB and set click listener
        val fabAddGrade = findViewById<FloatingActionButton>(R.id.fabAddGrade)
        fabAddGrade.setOnClickListener {
            val intent = Intent(this, AddGradeActivity::class.java)
            startActivity(intent)
        }

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomNav.selectedItemId = R.id.nav_grades

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, HomeActivity::class.java))
                    finish()
                    true
                }
                R.id.nav_schedule -> {
                    startActivity(Intent(this, ScheduleActivity::class.java))
                    finish()
                    true
                }
                R.id.nav_grades -> true
                else -> false
            }
        }
    }
}