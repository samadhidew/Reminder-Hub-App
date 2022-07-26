package com.example.myreminderhub

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*

class Upcoming : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upcoming)

        var actionBar = supportActionBar
        actionBar?.hide()

        val upbackbutton = findViewById<Button>(R.id.upbackbutton)
        upbackbutton.setOnClickListener {
          val intent = Intent(this, Menu::class.java)
          startActivity(intent)
      }

        val uessbtn = findViewById<Button>(R.id.uessbtn)
        uessbtn.setOnClickListener {
          val intent = Intent(this,Uessentials::class.java)
          startActivity(intent)
      }

        val ueventbtn = findViewById<Button>(R.id.ueventbtn)
        ueventbtn.setOnClickListener {
          val intent = Intent(this,Uevents::class.java)
          startActivity(intent)
      }

        val uobtn = findViewById<Button>(R.id.uobtn)
        uobtn.setOnClickListener {
          val intent = Intent(this,Uother::class.java)
          startActivity(intent)
      }


    }
}