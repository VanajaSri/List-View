package com.example.listview

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var lst: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lst = findViewById(R.id.List1)
        var arr = arrayOf("id", "Name", "Pn number", "Section")
        val adp = ArrayAdapter(this, android.R.layout.simple_list_item_1, arr)
        lst.adapter = adp

        lst.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = arr[position].toString()
            val inten = Intent(this, MainActivity2::class.java)
            inten.putExtra("ListedItem", selectedItem)
            startActivity(inten)

        }
    }
}

