package com.example.trainingtime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var create_training = findViewById(R.id.createTraining) as Button

        create_training.setOnClickListener {
            val intent = Intent(this, CreateTraining::class.java)
            // start your next activity
            startActivity(intent)
    }
}}