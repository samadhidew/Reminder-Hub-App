package com.example.myreminderhub

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*

class Monthlymain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monthlymain)

        var actionBar = supportActionBar
        actionBar?.hide()

        val monbackbutton = findViewById<Button>(R.id.monbackbutton)
        monbackbutton.setOnClickListener {
           val intent = Intent(this, Menu::class.java)
           startActivity(intent)
       }

        val billbutton = findViewById<Button>(R.id.billbutton)
        billbutton.setOnClickListener {
           val intent = Intent(this, Mbill::class.java)
           startActivity(intent)
       }

        val menbutton = findViewById<Button>(R.id.menbutton)
        menbutton.setOnClickListener {
           val intent = Intent(this, menbutton::class.java)
           startActivity(intent)
       }

        val minbutton = findViewById<Button>(R.id.minbutton)
        minbutton.setOnClickListener {
           val intent = Intent(this, Mincome::class.java)
           startActivity(intent)
       }



    }
}