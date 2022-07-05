package com.example.gymgoer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listLView)
        val names = arrayOf("DeadLift", "Squats", "OHP", "Bench")
        val arrayAdapter :ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)
        listView.adapter = arrayAdapter
        val intent: Intent = Intent(this, EditExercise::class.java)
        listView.setOnItemClickListener{adapterView, view, i ,l ->
            startActivity(intent)
            Toast.makeText(this, "Item Selected " + names[i], Toast.LENGTH_LONG).show()}
    }
}