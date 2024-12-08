package com.forktail.edittexts

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    //Defining variables for our edit text, text view and result
    lateinit var editText: EditText
    lateinit var ok: Button
    lateinit var result: TextView
    lateinit var image: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Connecting the components to their variable
        image = findViewById(R.id.imageView1)
        editText = findViewById(R.id.editTextText2)
        ok = findViewById(R.id.button1)
        result = findViewById(R.id.textView1)

        // If the user clicks ok then change the image displayed to another
            ok.setOnClickListener{
                image.setImageResource(R.drawable.logo_text)
            }



        // We check if the ok button is clicked and if it is then store the username
        // entered in the editext in a string and assign that string to the result textview
       /* ok.setOnClickListener{
            var userName: String = editText.text.toString()
            result.setText(userName)
        }
        */


    }
}