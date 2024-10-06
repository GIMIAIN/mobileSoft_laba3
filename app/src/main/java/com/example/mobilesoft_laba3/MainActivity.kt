package com.example.mobilesoft_laba3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextString: EditText
    private lateinit var editTextChar: EditText
    private lateinit var buttonFindLastIndex: Button
    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextString = findViewById(R.id.editTextString)
        editTextChar = findViewById(R.id.editTextChar)
        buttonFindLastIndex = findViewById(R.id.buttonFindLastIndex)
        textViewResult = findViewById(R.id.textViewResult)

        buttonFindLastIndex.setOnClickListener {
            val inputString = editTextString.text.toString()
            val searchChar = editTextChar.text.toString().getOrNull(0)

            if (searchChar != null) {
                val lastIndex = inputString.lastIndexOf(searchChar)
                textViewResult.text = if (lastIndex != -1) {
                    "Последний индекс '$searchChar': $lastIndex"
                } else {
                    "Символ '$searchChar' не найден."
                }
            } else {
                textViewResult.text = "Пожалуйста, введите символ."
            }
        }
    }
}