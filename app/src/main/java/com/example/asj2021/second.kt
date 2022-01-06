package com.example.asj2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent=intent
        val name = intent.getStringExtra("Name")
        val email=intent.getStringExtra("Email")
        val phone=intent.getStringExtra("Phone")

        val resultTv=findViewById<TextView>(R.id.resultTv)
        resultTv.text="Name : "+name+"\n\nEmail : "+email+"\n\nPhone : "+phone

        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent= Intent(this,third::class.java)
            startActivity(intent)
        }


    }
}