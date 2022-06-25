package com.example.myreminderhub

import android.app.*
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.myreminderhub.databinding.ActivityEduexamBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.util.*

class Eduexam : AppCompatActivity() {
    private lateinit var binding: ActivityEduexamBinding
    private lateinit var database: DatabaseReference

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEduexamBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_eduexam)


        var actionBar = supportActionBar
        actionBar?.hide()

        val eduexmbackbtn = findViewById<Button>(R.id.eduexmbackbtn)
        eduexmbackbtn.setOnClickListener {
            val intent = Intent(this, Educationmain::class.java)
            startActivity(intent)
        }
        createNotificationChannel()
        binding.addeduexamgnbtn.setOnClickListener {
            scheduleNotification()

        }

    }
    @RequiresApi(Build.VERSION_CODES.M)
    private fun scheduleNotification() {
        val intent = Intent(applicationContext, Notification::class.java)
        val title = binding.eduexamtitle.text.toString()
        intent.putExtra(titleExtra, title)


        val pendingIntent = PendingIntent.getBroadcast(
            applicationContext,
            notificationID,
            intent,
            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
        )

        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val time = getTime()
        alarmManager.setExactAndAllowWhileIdle(
            AlarmManager.RTC_WAKEUP,
            time,
            pendingIntent
        )
        showAlert(time, title)
    }


    private fun showAlert(time: Long, title: String) {
        val date = Date(time)
        val dateFormat = android.text.format.DateFormat.getLongDateFormat(applicationContext)
        val timeFormat = android.text.format.DateFormat.getTimeFormat(applicationContext)

        AlertDialog.Builder(this)
            .setTitle("Notification Scheduled")
            .setMessage(
                "Title: " + title +
                        "\nAt: " + dateFormat.format(date) + " " + timeFormat.format(date)
            )
            .setPositiveButton("Okay") { _, _ -> }
            .show()

        val  name =binding.eduexamtitle.text.toString()


        database = FirebaseDatabase.getInstance().getReference("Exams")
        val Exams = Exams(title,dateFormat.format(date),timeFormat.format(date) )



        database.child(name).setValue(Exams).addOnSuccessListener {
            binding.eduexamtitle.text?.clear()

            Toast.makeText(this, "Successfully saved", Toast.LENGTH_SHORT).show()


        }.addOnFailureListener {


            Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun getTime(): Long {
        val minute = binding.timePicker.minute
        val hour = binding.timePicker.hour
        val day = binding.datePicker.dayOfMonth
        val month = binding.datePicker.month
        val year = binding.datePicker.year


        val calendar = Calendar.getInstance()
        calendar.set(year, month, day, hour, minute)
        return calendar.timeInMillis
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun createNotificationChannel() {
        val name = "Notif Channel"
        val desc = "A Description of the Channel"
        val importance = NotificationManager.IMPORTANCE_DEFAULT
        val channel = NotificationChannel(channelID, name, importance)
        channel.description = desc
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(channel)

    }
}