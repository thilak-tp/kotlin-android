package com.forktail.clicks

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    // We assign the text id to the text in the activity xml or the layout editor
    // Here you declare a variable to hold the text as below
    lateinit var textView : TextView
    lateinit var onMagic: Button
    lateinit var myButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        // Here we connect the textview variable with id of the textview we created in the xml
        textView = findViewById(R.id.textSample)
        onMagic = findViewById(R.id.button1)
        myButton = findViewById(R.id.button2)
        // Here we check for the button click on textView and if clicked, it will change the color
        // of the text to red
        textView.setOnClickListener{
            textView.setTextColor(Color.GRAY)
            // we change the bg text color to cyan
            textView.setBackgroundColor(Color.CYAN)
        }

        onMagic.setOnClickListener{
            onMagic.setBackgroundColor(Color.GRAY)
            textView.setBackgroundColor(Color.GREEN)
            textView.setText("We do performance tesing")
            textView.isVisible = false;
            onMagic.isVisible = false;
        }

        myButton.setOnClickListener{
            myButton.isVisible = true;
            textView.isVisible = true;
        }
    }
}