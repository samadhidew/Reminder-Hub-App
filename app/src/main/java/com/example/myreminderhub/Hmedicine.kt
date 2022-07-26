package com.example.myreminderhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Hmedicine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        var actionBar = supportActionBar
        actionBar?.hide()

        val dailybutton = findViewById<Button>(R.id.dailybutton)
        dailybutton.setOnClickListener {
            val intent = Intent(this, Hdailymedi::class.java)
            startActivity(intent)
        }

      //  val othermedicinebtn = findViewById<Button>(R.id.othermedicinebtn)
      //  othermedicinebtn.setOnClickListener {
      //      val intent = Intent(this, Hother::class.java)
      //      startActivity(intent)
      //  }
        val mebackbutton = findViewById<Button>(R.id.mebackbutton)
        mebackbutton.setOnClickListener {
            val intent = Intent(this, Healthmain::class.java)
            startActivity(intent)
        }
    }
}