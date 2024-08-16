package com.example.dndtime

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    /**Rolls a dice and returns a list with results*/
    fun roll_dice(dice: Int, numRolls: Int = 1): List<Int>
    {
        // Restrictions to rolls and dice
        if (numRolls < 1 || dice < 2)
        {
            return emptyList()
        }
        val rolls = List(numRolls) { Random.nextInt(1,dice+1) }
        return rolls
    }
    // Dice Buttons:
    lateinit var btnD4 : Button
    lateinit var btnD6 : Button
    lateinit var btnD8 : Button
    lateinit var btnD10 : Button
    lateinit var btnD12 : Button
    lateinit var btnD20 : Button

    //


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}