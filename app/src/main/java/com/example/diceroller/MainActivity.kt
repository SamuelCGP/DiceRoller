package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<TextView>(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
    }

    private fun rollDice(){
        val randomInt = (1..6).random()
        val labelResult: TextView = findViewById(R.id.label_result)

        labelResult.setText(randomInt)

        Toast.makeText(this, "Result: $randomInt",
            Toast.LENGTH_SHORT).show()
    }
}