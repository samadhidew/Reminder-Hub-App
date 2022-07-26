package com.example.myreminderhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Mincome : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mincome)

        var actionBar = supportActionBar
        actionBar?.hide()

        val mibackbutton1 = findViewById<Button>(R.id.mibackbutton1)
        mibackbutton1.setOnClickListener {
            val intent = Intent(this, Monthlymain::class.java)
            startActivity(intent)
        }
    }
}