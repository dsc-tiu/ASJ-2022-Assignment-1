package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

//        rollDice(6)

        rollButton.setOnClickListener { rollDice(6) }

    }

    private fun rollDice(sides: Int) {
        val dice1 = Dice(sides)
        val dice2 = Dice(sides)

        val diceRoll1 = dice1.roll()
        val diceRoll2 = dice2.roll()

        val diceImage: ImageView = findViewById(R.id.imageView)
        val drawableResource = when (diceRoll1) {
            1 -> R.drawable.ic_dice_one
            2 -> R.drawable.ic_dice_two
            3 -> R.drawable.ic_dice_three
            4 -> R.drawable.ic_dice_four
            5 -> R.drawable.ic_dice_five
            else -> R.drawable.ic_dice_six
        }
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll1.toString()

        val diceImage2: ImageView = findViewById(R.id.imageView2)
        val drawableResource2 = when (diceRoll2) {
            1 -> R.drawable.ic_dice_one
            2 -> R.drawable.ic_dice_two
            3 -> R.drawable.ic_dice_three
            4 -> R.drawable.ic_dice_four
            5 -> R.drawable.ic_dice_five
            else -> R.drawable.ic_dice_six
        }
        diceImage2.setImageResource(drawableResource2)
        diceImage2.contentDescription = diceRoll2.toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}