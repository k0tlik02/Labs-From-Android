package com.example.myapplication

import android.graphics.Typeface.MONOSPACE
import android.graphics.Typeface.SERIF
import android.graphics.Typeface.SANS_SERIF
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    var radioGroup: RadioGroup? = null
    lateinit var radioButton: RadioButton
    private lateinit var button: Button
    private lateinit var button2:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        title = "Laba1"
        radioGroup = findViewById(R.id.radioGroup1)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)


        button2.setOnClickListener {
            val mssg = ""
            val txtView = findViewById<TextView>(R.id.textView2).apply {
                text = mssg
            }
        }

        button.setOnClickListener {
            val selectedOption: Int = radioGroup!!.checkedRadioButtonId
            radioButton = findViewById(selectedOption)
            Toast.makeText(baseContext, radioButton.text, Toast.LENGTH_SHORT).show()


            val edittxt = findViewById<EditText>(R.id.editTextTextPersonName)
            val msg = edittxt.text.toString();
            if (msg == "") {
                Toast.makeText(applicationContext, "no text!!", Toast.LENGTH_SHORT).show()
            }

            val txtView = findViewById<TextView>(R.id.textView2)
            if (radioButton.id==R.id.radioButton1)
            {
                txtView.typeface= SERIF
            }
            if (radioButton.id==R.id.radioButton2)
            {
                txtView.typeface=SANS_SERIF
            }
            if (radioButton.id==R.id.radioButton3)
            {
                txtView.typeface = MONOSPACE
            }
            txtView.apply {
                text = msg
            }

        }
    }

}