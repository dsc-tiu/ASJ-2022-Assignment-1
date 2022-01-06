package com.example.asj2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEt= findViewById<TextView>(R.id.nameEt)
        val emailEt= findViewById<TextView>(R.id.emailEt)
        val phoneEt= findViewById<TextView>(R.id.phoneEt)
        val saveBtn=findViewById<Button>(R.id.saveBtn)

        saveBtn.setOnClickListener {

            val name=nameEt.text.toString()
            val email=emailEt.text.toString()
            val phone=phoneEt.text.toString()


            val intent= Intent(this,second::class.java)
            intent.putExtra("Name",name)
            intent.putExtra("Email",email)
            intent.putExtra("Phone",phone)
            startActivity(intent)
        }
    }
}