package com.example.introduction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var Buttonworkingstudio:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttonworkingstudio=findViewById(R.id.workstudio)

        Buttonworkingstudio.setOnClickListener {
            val mimi=Intent(this, workingstudio::class.java)
            startActivity(intent)
        Buttonworkingstudio=findViewById(R.id.workstudio)
            Buttonworkingstudio.setOnClickListener {
                val intent=Intent(this,register::class.java)
                startActivity(intent)
            }
        }
    }
}