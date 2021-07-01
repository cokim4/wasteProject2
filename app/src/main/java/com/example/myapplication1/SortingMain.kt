package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SortingMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorting_main)

        val bbtn : Button = findViewById(R.id.backbtn)

        bbtn.setOnClickListener {
            finish()
        }
    }
}
