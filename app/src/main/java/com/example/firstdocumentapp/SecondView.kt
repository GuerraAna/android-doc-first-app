package com.example.firstdocumentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class SecondView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_view)

        val message = intent.getStringExtra(TEXT_MESSAGE)
        val textView = findViewById<TextView>(R.id.editText).apply{
            text = message
        }
    }
}