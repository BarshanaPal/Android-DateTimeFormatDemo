package com.wipro.sampledemo

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.text.format.DateFormat.getMediumDateFormat
import android.text.format.DateFormat.is24HourFormat
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {
    private lateinit var dateFormat:TextView
    private lateinit var date:TextView
    private lateinit var time:TextView
    private lateinit var timeFormat:TextView
    private lateinit var dateButton:Button
    private lateinit var timeButton: Button
    private lateinit var imageButton: ImageButton
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dateFormat=findViewById(R.id.dateFormat)
        date=findViewById(R.id.date)
        time=findViewById(R.id.time)
        timeFormat=findViewById(R.id.timeFormat)
        dateButton=findViewById(R.id.dateButton)
        timeButton=findViewById(R.id.timeButton)
        imageButton=findViewById(R.id.next_page)

        imageButton.setOnClickListener{
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }


        val calendar=Calendar.getInstance()
        val currentDate=DateFormat.getDateInstance(DateFormat.DEFAULT).format(calendar.time)
        val currentTime=DateFormat.getTimeInstance(DateFormat.DEFAULT).format(calendar.time)
        val getDateFormat = getMediumDateFormat(this)


        dateButton.setOnClickListener {
            date.text= currentDate
            dateFormat.text= (getDateFormat as SimpleDateFormat).toPattern()
        }
        timeButton.setOnClickListener {
            time.text=currentTime
            if(is24HourFormat(this@MainActivity)){
                timeFormat.text="24Hr"
            } else{
                timeFormat.text="12Hr"
            }
        }

    }
}