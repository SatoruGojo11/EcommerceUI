package com.example.ecommerceuifirst

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var pcbtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pcbtn = findViewById(R.id.pcbtncategory)

        pcbtn.setOnClickListener {

            intent = Intent(this,R.layout.activity_detail::class.java)
            startActivity(intent)

        }
    }
}