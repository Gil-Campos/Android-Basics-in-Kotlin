package com.gilcampos.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {

    /**
     * Every Kotlin program has a main() function but in Android code the equivalent of the main()
     * function would be onCreate, the Android system calls the onCreate() method in your MainActivity
     * when your app is opened for the first time.
     * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }


    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val resultTextView: TextView = findViewById(R.id.textView)

        // Update the screen with the dice roll
        resultTextView.text = dice.roll().toString()
    }
}