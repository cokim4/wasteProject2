package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val areaset : Button = findViewById(R.id.areasetbtn)
        val btnbig : Button = findViewById(R.id.mbtnbig)
        val sort : Button = findViewById(R.id.mbtnsort)
        val set : Button = findViewById(R.id.btnsetting)
        val notice : Button = findViewById(R.id.noticebtn)
        val login : Button = findViewById(R.id.btnlogin)

        login.setOnClickListener {
            intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        sort.setOnClickListener {
            intent = Intent(this, SortingMain::class.java)
            startActivity(intent)
        }
        notice.setOnClickListener {
            intent = Intent(this, Notice::class.java)
            startActivity(intent)
        }
        areaset.setOnClickListener {
            intent = Intent(this, AreaSetting::class.java)
            startActivity(intent)
        }
        btnbig.setOnClickListener {
            intent = Intent(this, BigWastecam::class.java)
            startActivity(intent)
        }
        set.setOnClickListener {
            intent = Intent(this, Setting::class.java)
            startActivity(intent)
        }

    }
}
