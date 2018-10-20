package com.example.dying.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.ten_key.*

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var editText: EditText
    lateinit var button: Button

    val buttonListener = object : View.OnClickListener {
        override fun onClick(view: View?) {
            recentOperator = R.id.button_equal
            result = 0.0
            isOperatorKeyPushed = false

            textView.setText("")
            editText.setText("")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById<TextView>(R.id.textView)
        editText = findViewById<EditText>(R.id.editText)
        button = findViewById<Button>(R.id.button)

        button.setOnClickListener(buttonListener)

        findViewById<Button>(R.id.button_0).setOnClickListener(buttonNumberListener)
        findViewById<Button>(R.id.button_1).setOnClickListener(buttonNumberListener)
        findViewById<Button>(R.id.button_2).setOnClickListener(buttonNumberListener)
        findViewById<Button>(R.id.button_3).setOnClickListener(buttonNumberListener)
        findViewById<Button>(R.id.button_4).setOnClickListener(buttonNumberListener)
        findViewById<Button>(R.id.button_5).setOnClickListener(buttonNumberListener)
        findViewById<Button>(R.id.button_6).setOnClickListener(buttonNumberListener)
        findViewById<Button>(R.id.button_7).setOnClickListener(buttonNumberListener)
        findViewById<Button>(R.id.button_8).setOnClickListener(buttonNumberListener)
        findViewById<Button>(R.id.button_9).setOnClickListener(buttonNumberListener)
        findViewById<Button>(R.id.button_dot).setOnClickListener(buttonNumberListener)

        findViewById<Button>(R.id.button_plus).setOnClickListener(buttonOperatorListener)
        findViewById<Button>(R.id.button_minus).setOnClickListener(buttonOperatorListener)
        findViewById<Button>(R.id.button_multi).setOnClickListener(buttonOperatorListener)
        findViewById<Button>(R.id.button_devide).setOnClickListener(buttonOperatorListener)
        findViewById<Button>(R.id.button_equal).setOnClickListener(buttonOperatorListener)

    }

    var isOperatorKeyPushed: Boolean = true // 初期化

    var recentOperator: Int = R.id.button_equal
    var result: Double = 0.0



    val buttonNumberListener = object : View.OnClickListener {
        override fun onClick(view: View?) {
            val button = view as Button

            if (isOperatorKeyPushed == true) {
                editText.setText(button.getText());
            } else {
                editText.append(button.getText())
            }

            isOperatorKeyPushed = false
        }
    }

    val buttonOperatorListener = object : View.OnClickListener {
        override fun onClick(view: View?) {
            val operatorButton = view as Button
            val value: Double = editText.getText().toString().toDouble()

            if (recentOperator == R.id.button_equal) {
                result = value
            } else {
                result = calc(recentOperator, result, value)
            }

            recentOperator = operatorButton.getId();
            textView.setText(operatorButton.getText())
            editText.setText(result.toString())
            isOperatorKeyPushed = true
        }
    }
//    textView.setText(editText.getText().toString())

    fun calc(operator: Int, value1: Double, value2: Double): Double {
        when (operator) {
            R.id.button_plus
            -> return value1 + value2
            R.id.button_minus
            -> return value1 - value2
            R.id.button_multi
            -> return value1 * value2
            R.id.button_devide
            -> return value1 / value2
            else
            -> return value1
        }
    }
}
