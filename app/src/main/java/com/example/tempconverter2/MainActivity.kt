package com.example.tempconverter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //


       var fahr = findViewById<View>(R.id.temp_in_fahr) as EditText
        var celsius = findViewById<View>(R.id.temp_in_celsius) as EditText
      // var fahr = findViewById<EditText>(R.id.temp_in_fahr)
      //  var celsius = findViewById<EditText>(R.id.temp_in_celsius)
       // assign variables to the buttons
        val reset = findViewById<Button>(R.id.reset_button)
        val convert = findViewById<Button>(R.id.convert_button)

        // when a user taps the convert btn, if/else
        convert.setOnClickListener {
            if (celsius.text.toString().isEmpty()) {
                val fConversion = (fahr.text.toString().toFloat() - 32) / 1.8
                // setText requires a string
                celsius.setText(fConversion.toString())
            } else if (fahr.text.toString().isEmpty()){
                val cConversion = (celsius.text.toString().toFloat() * 1.8) + 32
                fahr.setText(cConversion.toString())
            }

        }
        reset.setOnClickListener {
            celsius.setText("")
            fahr.setText("")
        }
    }

}

