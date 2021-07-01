package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class AreaSetting : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_setting)

        // 스피너 선언
        val spin : Spinner = findViewById(R.id.areaspin2)

        // 어댑터 설정 - resource - array.xml에 있는 아이템 목록을 추가
        spin.adapter = ArrayAdapter.createFromResource(this, R.array.arealist, android.R.layout.simple_spinner_item)

    }
}
