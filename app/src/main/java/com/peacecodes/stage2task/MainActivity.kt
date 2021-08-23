package com.peacecodes.stage2task

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDisplay = findViewById<MaterialButton>(R.id.btnDisplay)
        btnDisplay.setOnClickListener() {displayContent(it)

        }
    }

    fun displayContent(view: View) {
        val displayName = findViewById<TextView>(R.id.displayName)
        val displayEmail = findViewById<TextView>(R.id.displayEmail)
        val etName = findViewById<TextInputEditText>(R.id.etName)
        val etEmail = findViewById<TextInputEditText>(R.id.etEmail)

        //connecting the editText to the textview to show what the user types in
        displayName.text = etName.text
        displayEmail.text = etEmail.text

        //hide the edit texts when button is clicked
        etName.visibility = View.GONE
        etEmail.visibility = View.GONE
 
        //hide the button
        view.visibility = View.GONE

        // make the textView visible
        displayName.visibility = View.VISIBLE
        displayEmail.visibility = View.VISIBLE

//        // Hiding the Keyboard after the user finishes typing
//        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
}