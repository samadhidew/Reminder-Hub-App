package com.example.myreminderhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Occupationmain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_occupationmain)

        var actionBar = supportActionBar
        actionBar?.hide()

        val occbackbutton = findViewById<Button>(R.id.occbackbutton)
        occbackbutton.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        val projectbutton = findViewById<Button>(R.id.projectbutton)
        projectbutton.setOnClickListener {
            val intent = Intent(this, Oproject::class.java)
            startActivity(intent)
        }

         val oeventbtn = findViewById<Button>(R.id.oeventbtn)
         oeventbtn.setOnClickListener {
             val intent = Intent(this, Oevents::class.java)
             startActivity(intent)
         }

      // val ootherbtn = findViewById<Button>(R.id.ootherbtn)
      // ootherbtn.setOnClickListener {
      //      val intent = Intent(this, Oother::class.java)
      //      startActivity(intent)
      //  }



    }
}