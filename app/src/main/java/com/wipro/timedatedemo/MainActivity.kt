package com.wipro.timedatedemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var simpleDateFormat: SimpleDateFormat
    private lateinit var getTimeAndDate:TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getTimeAndDate=findViewById(R.id.getDateAndTime)
        button=findViewById(R.id.button)
        val currentTime = Calendar.getInstance().time
        simpleDateFormat = SimpleDateFormat("hh:mm:ss aa HH:mm:ss aa  dd-MM-YYYY MM-dd-yyyy")
        val output = simpleDateFormat.format(currentTime)
       button.setOnClickListener(object : View.OnClickListener{
           override fun onClick(v: View?) {
               getTimeAndDate.text=output
           }

       })

    }
}