package com.example.myreminderhub

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*

class Educationmain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_educationmain)


        var actionBar = supportActionBar
        actionBar?.hide()

        val edubackbutton = findViewById<Button>(R.id.edubackbutton)
        edubackbutton.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }


        val assignbutton = findViewById<Button>(R.id.assignbutton)
        assignbutton.setOnClickListener {
            val intent = Intent(this, Eduassignments::class.java)
            startActivity(intent)
        }


        val exambtn = findViewById<Button>(R.id.exambtn)
        exambtn.setOnClickListener {
            val intent = Intent(this, Eduexam::class.java)
            startActivity(intent)
        }


        val eventbtn = findViewById<Button>(R.id.eventbtn)
        eventbtn.setOnClickListener {
            val intent = Intent(this, Eduevents::class.java)
            startActivity(intent)
        }


        val otherbtn = findViewById<Button>(R.id.otherbtn)
        otherbtn.setOnClickListener {
            val intent = Intent(this, Eduother::class.java)
            startActivity(intent)
        }
        val eduviewbtn = findViewById<Button>(R.id.eduviewbtn)
        eduviewbtn.setOnClickListener {
            val intent = Intent(this, viewreminders::class.java)
            startActivity(intent)
        }

    }
}
