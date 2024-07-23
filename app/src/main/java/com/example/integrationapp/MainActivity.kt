package com.example.integrationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var openCalculatorButton: Button
    private lateinit var openBookSelectorButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openCalculatorButton = findViewById(R.id.openCalculatorButton)
        openBookSelectorButton = findViewById(R.id.openBookSelectorButton)

        openCalculatorButton.setOnClickListener {
            // Start Calculator Activity
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }

        openBookSelectorButton.setOnClickListener {
            // Start Book Selector Activity
            val intent = Intent(this, BookSelectorActivity::class.java)
            startActivity(intent)
        }
    }
}
