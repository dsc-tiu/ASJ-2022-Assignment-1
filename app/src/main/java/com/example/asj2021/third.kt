package com.example.asj2021

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView

class third : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val root_layout=findViewById<View>(R.id.root_layout)

        val animDrawable=root_layout.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(50)
        animDrawable.setExitFadeDuration(5000)
        animDrawable.start()

        val rollBtn=findViewById<Button>(R.id.rollBtn)
        val result=findViewById<TextView>(R.id.result)
        val seekBar=findViewById<SeekBar>(R.id.seekBar)

        rollBtn.setOnClickListener {
            val rand = java.util.Random().nextInt(seekBar.progress)+1
            result.text=rand.toString()
        }
        val button2=findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent= Intent(this,diceroller::class.java)
            startActivity(intent)
        }

    }
}