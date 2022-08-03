package com.example.spinnerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var spinnerMothes = findViewById<Spinner>(R.id.spMonths)
        var customList = listOf<String>("Fist","Second","Third","Fourth","Fifth")
        var adapter = ArrayAdapter<String>(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item,customList)
        spinnerMothes.adapter = adapter

        spinnerMothes.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(adapterview: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(
                    this@MainActivity,
                     "you selected ${adapterview?.getItemAtPosition(position).toString()}",
                     Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
    }
}