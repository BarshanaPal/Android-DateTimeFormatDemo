package com.wipro.sampledemo

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.DateFormat.getDateFormat
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_settings.*
import java.text.SimpleDateFormat
import java.util.*

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val getDate1:TextView=findViewById(R.id.textView1)
        val getDate2:TextView=findViewById(R.id.textView2)
        val getTime1:TextView=findViewById(R.id.textView3)
        val getTime2:TextView=findViewById(R.id.textView4)

        val button1:TextView=findViewById(R.id.button1)
        val button2:TextView=findViewById(R.id.button2)
        val button3:TextView=findViewById(R.id.button3)
        val button4:TextView=findViewById(R.id.button4)

        button1.setOnClickListener {
            textView1.text=getDate1()
        }
         button2.setOnClickListener {
             textView2.text=getDate2()
         }
        button3.setOnClickListener {
            textView3.text=getTime1()
        }
        button4.setOnClickListener {
            textView4.text=getTime2()
        }



    }
    private fun getDate1(): String? {
        val calendar: Date = Calendar.getInstance().time
        return SimpleDateFormat("MMddyyyy").format(calendar)
    }
    private fun getDate2():String?{
        val calendar: Date = Calendar.getInstance().time
        return SimpleDateFormat("ddMMyyyy").format(calendar)
    }
    private  fun getTime1(): String {
        val calendar: Date = Calendar.getInstance().time
        return SimpleDateFormat("hh:mm:ss aa").format(calendar)
    }
    private  fun getTime2(): String {
        val calendar: Date = Calendar.getInstance().time
        return SimpleDateFormat("HH:mm:ss ").format(calendar)
    }
}