package com.example.myreminderhub

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.myreminderhub.databinding.ActivityBirthdayBinding
import com.example.myreminderhub.databinding.ActivityPersonalBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.util.*

class Personal : AppCompatActivity() {
    private lateinit var binding: ActivityPersonalBinding
    private lateinit var database: DatabaseReference
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var actionBar = supportActionBar
        actionBar?.hide()

        val pbackbtn = findViewById<Button>(R.id.pbackbtn)
        pbackbtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.psavebtn.setOnClickListener {
            val  NICno  =binding.nid.text.toString()
            val  Passportno =binding.passportno.text.toString()
            val  PassExdate =binding.passportexp.text.toString()
            val  EmergencyContactno1=binding.emegencycontact1.text.toString()
            val  EmergencyContactno2=binding.emergencycontact2.text.toString()
            val  BloodGroup=binding.bloodgroup.text.toString()
            val  creditcardno=binding.cardno.text.toString()
            val  creditcardexdate=binding.cardexp.text.toString()
            database = FirebaseDatabase.getInstance().getReference("PersonalInformation")
            val PersonalInformation = PersonalInformation(NICno, Passportno,PassExdate,EmergencyContactno1,EmergencyContactno2,BloodGroup,creditcardno,creditcardexdate)



            database.child(NICno).setValue(PersonalInformation).addOnSuccessListener {
                binding.nid.text?.clear()
                binding.passportno.text?.clear()
                binding.passportexp.text?.clear()
                binding.emegencycontact1.text?.clear()
                binding.emergencycontact2.text?.clear()
                binding.bloodgroup.text?.clear()
                binding.cardno.text?.clear()
                binding.cardexp.text?.clear()


                Toast.makeText(this, "Successfully saved", Toast.LENGTH_SHORT).show()


            }.addOnFailureListener {


                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
            }


        }

    }
}