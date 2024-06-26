package com.example.taskpix.Modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.taskpix.R

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val btnNavigate: TextView = findViewById(R.id.btnlog)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

        val backnavigate: ImageView = findViewById(R.id.backbtn)
        backnavigate.setOnClickListener {
            finish()
        }

        val regbtnNavigate: Button = findViewById(R.id.regbtn)
        regbtnNavigate.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }
    }
}