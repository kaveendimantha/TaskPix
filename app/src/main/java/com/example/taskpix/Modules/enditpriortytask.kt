package com.example.taskpix.Modules

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.taskpix.R

class enditpriortytask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_enditpriortytask)

        val backnavigate: ImageView = findViewById(R.id.btnback4)
        backnavigate.setOnClickListener {
            finish()
        }

    }
}
