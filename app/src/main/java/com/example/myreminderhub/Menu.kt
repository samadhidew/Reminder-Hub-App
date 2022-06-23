package com.example.myreminderhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var actionBar = supportActionBar
        actionBar?.hide()

        val edubtn = findViewById<Button>(R.id.edubtn)
        edubtn.setOnClickListener {
            val intent = Intent(this, Educationmain::class.java)
            startActivity(intent)
        }

        val occbtn = findViewById<Button>(R.id.occbtn)
        occbtn.setOnClickListener {
            val intent = Intent(this, Occupationmain::class.java)
            startActivity(intent)
        }

        val upbtn = findViewById<Button>(R.id.upbtn)
        upbtn.setOnClickListener {
            val intent = Intent(this, Upcoming::class.java)
            startActivity(intent)
        }

        val bdbtn = findViewById<Button>(R.id.bdbtn)
        bdbtn.setOnClickListener {
            val intent = Intent(this, Birthday::class.java)
            startActivity(intent)
        }

        val pidbtn = findViewById<Button>(R.id.pidbtn)
        pidbtn.setOnClickListener {
            val intent = Intent(this, Personal::class.java)
            startActivity(intent)
        }

        val healthdbtn = findViewById<Button>(R.id.healthdbtn)
        healthdbtn.setOnClickListener {
            val intent = Intent(this, Healthmain::class.java)
            startActivity(intent)
        }

        val monup = findViewById<Button>(R.id.monup)
        monup.setOnClickListener {
            val intent = Intent(this, Monthlymain::class.java)
            startActivity(intent)
        }
        val devicebtn = findViewById<Button>(R.id.devicebtn)
        devicebtn.setOnClickListener {
            val intent = Intent(this, Device::class.java)
            startActivity(intent)
        }
    }
}

