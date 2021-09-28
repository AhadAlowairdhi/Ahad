package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // declare everything here
    lateinit var toabt: Button
    lateinit var tvbt: Button
    lateinit var gobt: Button
    lateinit var edname: EditText
    lateinit var edloc: EditText
    lateinit var edmob: EditText
    lateinit var tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // initialize everything here
        toabt = findViewById(R.id.button1)
        tvbt = findViewById(R.id.button2)
        gobt = findViewById(R.id.button3)
        edname = findViewById(R.id.edit1)
        edloc = findViewById(R.id.edit2)
        edmob = findViewById(R.id.edit3)
        tv = findViewById(R.id.textView)

        toabt.setOnClickListener {
            // get the input from 3 editTexts
            //get and add the value to string
            Toast.makeText(applicationContext, "${edname.text} ${edloc.text} ${edmob.text}",Toast.LENGTH_SHORT ).show()

        }
        tvbt.setOnClickListener {
            tv.text = "${edname.text} ${edloc.text} ${edmob.text}"
        }
        gobt.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("ahad",edname.text.toString())
            intent.putExtra("riyadh",edloc.text.toString())
            intent.putExtra("+96650",edmob.text.toString())

            startActivity(intent)
        }
    }
}