package com.example.taskpix.Modules

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.taskpix.R

class addTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_task)

        val Navigate22: Button = findViewById(R.id.Dtskbtn)
        Navigate22.setOnClickListener {
            val intent = Intent(this, addDailyTask::class.java)
            startActivity(intent)

        }
        val navigate: ImageView = findViewById(R.id.back11)
        navigate.setOnClickListener {
            finish()

        }
        val Navigate2: Button = findViewById(R.id.addtsk3)
        Navigate2.setOnClickListener {
            val intent = Intent(this, calanderPriorty::class.java)
            startActivity(intent)

        }



    }
}
