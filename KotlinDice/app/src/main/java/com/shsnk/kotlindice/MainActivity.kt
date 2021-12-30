package com.shsnk.kotlindice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button=findViewById(R.id.buttonRoll)
        btn.setOnClickListener {
        //temporary text
            var toast=Toast.makeText(this,"Dice Rolled", Toast.LENGTH_SHORT)
            toast.show()
        //permanent text show
            var side1=dice(6)
            var RandomNumber = side1.roll()
            var text2 : TextView= findViewById(R.id.textView2)
            text2.text=RandomNumber.toString()
            var diceImage : ImageView =findViewById(R.id.dice_1)
                when(RandomNumber)
                {
                    1-> diceImage.setImageResource(R.drawable.dice_1)
                    2-> diceImage.setImageResource(R.drawable.dice_2)
                    3-> diceImage.setImageResource(R.drawable.dice_3)
                    4-> diceImage.setImageResource(R.drawable.dice_4)
                    5-> diceImage.setImageResource(R.drawable.dice_5)
                    6-> diceImage.setImageResource(R.drawable.dice_6)
                }

        // textShow.text=RandomNumber.toString() //Important to convert number into text
            /*Dice No. 2
            var side2=dice(12)
            var RandomNumber2=side2.roll()
            var dice2 : TextView = findViewById(R.id.textView2)
                dice2.text=RandomNumber2.toString()
             */
        }

    }
}
class dice(var Side:Int)
{
    fun roll():Int
    {
        return ((1..Side).random())
    }
}