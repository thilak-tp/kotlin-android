package com.forktail.radiobuttons

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var layout: LinearLayout
    lateinit var radioButtonGreen: RadioButton
    lateinit var radioButtonYellow: RadioButton
    lateinit var radioButtonRed: RadioButton
    lateinit var changeButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.linearlayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        layout = findViewById(R.id.linearlayout)
        radioButtonGreen = findViewById(R.id.greenbutton)
        radioButtonYellow = findViewById(R.id.yellowbutton)
        radioButtonRed = findViewById(R.id.redbutton)
        changeButton = findViewById(R.id.buttonchange)

        changeButton.setOnClickListener{
            if(radioButtonGreen.isChecked)
            {
                layout.setBackgroundColor(Color.GREEN)
            }
            else if(radioButtonYellow.isChecked)
            {
                layout.setBackgroundColor(Color.YELLOW)
            }
            else if(radioButtonRed.isChecked)
            {
                layout.setBackgroundColor(Color.RED)
            }
        }
    }

}