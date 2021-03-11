package com.example.androidbelyaev

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private var number = 0
    private lateinit var squareButton : Button
    private lateinit var numberTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initButtons()
        numberTextView = findViewById(R.id.mainTextView)
        Log.i(this.localClassName, "Successfully created")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        numberTextView.text.toString().toInt()
        number++
        numberTextView.text = "$number"
        Log.i(this.localClassName, "Configuration changed")
    }

    private fun openSquareActivity(){
        val intent = Intent(this, SquareActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, number.toString())
        }
        startActivity(intent)
    }

    private fun initButtons(){
        squareButton = findViewById(R.id.toSquareButton)
        squareButton.setOnClickListener {
            openSquareActivity()
        }
    }
}