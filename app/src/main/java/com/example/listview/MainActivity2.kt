package com.example.listview

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    lateinit var txt: TextView
    lateinit var txt2:EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button : Button = findViewById(R.id.btn)

        txt = findViewById(R.id.textView)
        txt2 = findViewById(R.id.text2)

        val intent = intent
        val selectedValue = intent.getStringExtra("ListedItem")
        if (selectedValue != null) {
            txt.text = "Selected Item: $selectedValue"
        } else {
            txt.text = "No data received"
        }
        button.setOnClickListener(){
            call()
        }
    }

    fun call(){
        val edtext = txt2.text.toString()
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("Message",edtext)
            startActivity(intent)
        finish()

    }

}
