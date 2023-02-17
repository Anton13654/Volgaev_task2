package com.example.volgaev_task2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var numberField: TextView
    private lateinit var buttonSecondActivity: Button
    val nameActivity = "mainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("logs", "onCreate $nameActivity")

        numberField = findViewById(R.id.textView)
        buttonSecondActivity = findViewById(R.id.button)


        buttonSecondActivity.setOnClickListener{
            val newTransition = Intent(this, SquareActivity::class.java)
            newTransition.putExtra("key", numberField.text.toString().toInt())
            startActivity(newTransition)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("key", numberField.text.toString().toInt())
    }

    @SuppressLint("SetTextI18n")
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        numberField.text = (savedInstanceState.getInt("key") + 1).toString()
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