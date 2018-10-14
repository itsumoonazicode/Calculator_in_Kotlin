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

    val textView: TextView = findViewById(R.id.textView)
    val editText: EditText = findViewById(R.id.editText)
    val button: Button = findViewById(R.id.button)

    val buttonListener = object : View.OnClickListener {
        override fun onClick(v: View?) {
            textView.setText(editText.getText().toString())
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(buttonListener)

    }
}
