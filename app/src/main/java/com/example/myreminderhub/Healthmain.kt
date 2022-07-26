package com.example.myreminderhub

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*

class Healthmain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_healthmain)

        var actionBar = supportActionBar
        actionBar?.hide()


        val helbackbutton = findViewById<Button>(R.id.helbackbutton)
        helbackbutton.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        val docbtn = findViewById<Button>(R.id.docbtn)
        docbtn.setOnClickListener {
            val intent = Intent(this, Hdocmeet::class.java)
            startActivity(intent)
        }
        val medibtn = findViewById<Button>(R.id.medibtn)
        medibtn.setOnClickListener {
            val intent = Intent(this, Hmedicine::class.java)
            startActivity(intent)
        }
        val exbtn = findViewById<Button>(R.id.exbtn)
        exbtn.setOnClickListener {
            val intent = Intent(this, Hexersice::class.java)
            startActivity(intent)


        }
    }
}
