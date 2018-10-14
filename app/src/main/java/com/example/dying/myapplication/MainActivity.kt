package com.example.dying.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val value1: int = 1
        val value2: int = 2

        val value: double = value1 / value2
        val textView = findViewById<TextView>(R.id.textView)
        textView.setText(String.valueOf(value))

        val editText = findViewById<EditText>(R.id.editText)
        editText.setText("EditTextに文字列を表示！")

        val string: String = editText.getText().toString()
        Log.d("EditTextTest", string)
    }
}
