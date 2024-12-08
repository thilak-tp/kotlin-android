package com.forktail.checkbox

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var checkBoxMale : CheckBox
    lateinit var checkBoxFemale : CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        textView = findViewById(R.id.textView)
        checkBoxMale = findViewById(R.id.CheckBoxMale)
        checkBoxFemale = findViewById(R.id.checkBoxFemale)

        checkBoxMale.setOnClickListener{
        if(checkBoxMale.isChecked){
            textView.setText("You are a male.")
            checkBoxFemale.isChecked = false;
        }
        else
        {
            textView.setText("What is your Gender?")

        }
        }
        checkBoxFemale.setOnClickListener{
            if(checkBoxFemale.isChecked){
                textView.setText("You are a Female.")
                checkBoxMale.isChecked = false;
            }
            else
            {
                textView.setText("What is your Gender?")

            }
        }


    }

}