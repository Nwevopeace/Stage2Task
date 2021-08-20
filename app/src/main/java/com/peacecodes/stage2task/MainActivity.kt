package com.peacecodes.stage2task

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

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
        val displayState = findViewById<TextView>(R.id.displayState)
        val displayEmail = findViewById<TextView>(R.id.displayEmail)
        val displayPhone = findViewById<TextView>(R.id.displayPhone)
        val etName = findViewById<TextInputEditText>(R.id.etName)
        val etEmail = findViewById<TextInputEditText>(R.id.etEmail)
        val etState = findViewById<TextInputEditText>(R.id.etState)
        val etPhone = findViewById<TextInputEditText>(R.id.etPhone)
//        val nameLayout = findViewById<TextInputEditText>(R.id.nameLa

        //connecting the editText to the textview to show what the user types in
        displayName.text = etName.text
        displayEmail.text = etEmail.text
        displayState.text = etState.text
        displayPhone.text = etPhone.text

//        //hide the layouts when the button is clicked
//        nameLayout.visibility = View.GONE
//        emailLayout.visibility = View.GONE
//        stateLayout.visibility = View.GONE
//        phoneLayout.visibility = View.GONE

        //hide the edit texts when button is clicked
        etName.visibility = View.GONE
        etEmail.visibility = View.GONE
        etState.visibility = View.GONE
        etPhone.visibility = View.GONE
 
        //hide the button
        view.visibility = View.GONE

        // make the textView visible
        displayName.visibility = View.VISIBLE
        displayEmail.visibility = View.VISIBLE
        displayState.visibility = View.VISIBLE
        displayPhone.visibility = View.VISIBLE

//        // Hiding the Keyboard after the user finishes typing
//        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
}