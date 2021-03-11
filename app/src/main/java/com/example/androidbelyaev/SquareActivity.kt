package com.example.androidbelyaev

import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SquareActivity : AppCompatActivity()  {
    private lateinit var squareTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.square_activity)
        val number = intent.getStringExtra(EXTRA_MESSAGE)!!.toInt()

        squareTextView = findViewById(R.id.squareTextView)
        squareTextView.text = "${number * number}"
        Log.i(this.localClassName, "Square activity created")
    }
}