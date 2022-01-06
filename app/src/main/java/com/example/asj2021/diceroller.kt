package com.example.asj2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.*

class diceroller : AppCompatActivity() {

    var diceImage : ImageView ?= null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diceroller)


        val btnRoll = findViewById<Button>(R.id.btnRoll)
        btnRoll.setOnClickListener { rolldice() }

        diceImage = findViewById(R.id.imgDice)

    }
    private fun rolldice() {
        val randomInt = Random().nextInt(6) + 1
        Toast.makeText(this, "Dice: $randomInt", Toast.LENGTH_SHORT).show()

        val drawableResource = when (randomInt) {

            1 -> R.drawable.ic_dice_one
            2 -> R.drawable.ic_dice_two
            3 -> R.drawable.ic_dice_three
            4 -> R.drawable.ic_dice_four
            5 -> R.drawable.ic_dice_five
            6 -> R.drawable.ic_dice_six

            else -> R.drawable.ic_dice
        }
        diceImage?.setImageResource(drawableResource)
    }

}