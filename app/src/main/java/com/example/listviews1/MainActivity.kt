package com.example.listviews1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val names = arrayOf("Burrito Bowl", "Burrito", "Quesadilla", "Tacos", "Chips", "Salsa")

        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, names)

        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "Item selected " + names[i], Toast.LENGTH_LONG)
                .show()
            }
        }


    }