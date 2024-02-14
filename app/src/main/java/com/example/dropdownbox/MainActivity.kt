package com.example.dropdownbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

lateinit var arrayList:ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arrayList=ArrayList()
            arrayList.add("abcd")
            arrayList.add("defg")
            arrayList.add("hijk")
            arrayList.add("pqrs")
            arrayList.add("xyz")


        val spinnerlist: Spinner = findViewById(R.id.spinnerlist)
        if (spinnerlist != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, arrayList
            )
            spinnerlist.adapter = adapter
        }
    }
}