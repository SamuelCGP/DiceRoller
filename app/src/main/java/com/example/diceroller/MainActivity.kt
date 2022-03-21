package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
    }

    private fun rollDice(){
        val randomInt = (1..6).random()
        val labelResult: TextView = findViewById(R.id.label_result)
        val rollButton = findViewById<Button>(R.id.roll_button)

        labelResult.text = randomInt.toString()

        val buttonColor = when (randomInt){
            1 -> "#FFF44336"
            2 -> "#FFFF5722"
            3 -> "#FFFFC107"
            4 -> "#FF8BC34A"
            5 -> "#FF3F51B5"
            else -> "#FF673AB7"
        }

        rollButton.setBackgroundColor(Color.parseColor(buttonColor))
        labelResult.setTextColor(Color.parseColor(buttonColor))

        Toast.makeText(this, "Result: $randomInt",
            Toast.LENGTH_SHORT).show()
    }
}