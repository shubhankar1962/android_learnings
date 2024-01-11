package com.example.fragmentcommunication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RecieverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reciever)

        val message =intent.getStringExtra("EXTRA_MESSAGE")

        val textView = findViewById<TextView>(R.id.recieveTextViewActivity).apply {
            text = message
        }

    }
}