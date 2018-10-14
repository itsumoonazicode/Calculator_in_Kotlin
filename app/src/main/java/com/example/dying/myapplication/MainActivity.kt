package com.example.dying.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var editText: EditText
    lateinit var button: Button

    val buttonListener = object : View.OnClickListener {
        override fun onClick(v: View?) {
            textView.setText(editText.getText().toString())
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById<TextView>(R.id.textView)
        editText = findViewById<EditText>(R.id.editText)
        button = findViewById<Button>(R.id.button)

        button.setOnClickListener(buttonListener)

        findViewById<EditText>(R.id.button_0).setOnClickListener(buttonNumberListener)
        findViewById<EditText>(R.id.button_1).setOnClickListener(buttonNumberListener)
        findViewById<EditText>(R.id.button_2).setOnClickListener(buttonNumberListener)
        findViewById<EditText>(R.id.button_3).setOnClickListener(buttonNumberListener)
        findViewById<EditText>(R.id.button_4).setOnClickListener(buttonNumberListener)
        findViewById<EditText>(R.id.button_5).setOnClickListener(buttonNumberListener)
        findViewById<EditText>(R.id.button_6).setOnClickListener(buttonNumberListener)
        findViewById<EditText>(R.id.button_7).setOnClickListener(buttonNumberListener)
        findViewById<EditText>(R.id.button_8).setOnClickListener(buttonNumberListener)
        findViewById<EditText>(R.id.button_9).setOnClickListener(buttonNumberListener)
        findViewById<EditText>(R.id.button_dot).setOnClickListener(buttonNumberListener)

    }

    val buttonNumberListener = object : View.OnClickListener {
        override fun onClick(view: View?) {
            val button = view as Button

            editText.append(button.getText())
        }
    }
}
