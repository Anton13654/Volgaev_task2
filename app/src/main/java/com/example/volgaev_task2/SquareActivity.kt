package com.example.volgaev_task2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SquareActivity : AppCompatActivity() {

    private lateinit var squareField: TextView
    val nameActivity = "SquareActivity"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square)
        Log.i("logs", "onCreate $nameActivity")

        val newNumber = intent.getIntExtra("key", 0)
        val newSquareNumber = newNumber * newNumber

        squareField = findViewById(R.id.square_field)
        squareField.text = newSquareNumber.toString()

    }

    override fun onStart() {
        super.onStart()
        Log.i("logs", "onStart $nameActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.i("logs", "onPause $nameActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.i("logs", "onResume $nameActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("logs", "onDestroy $nameActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.i("logs", "onStop $nameActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("logs", "onRestart $nameActivity")
    }
}