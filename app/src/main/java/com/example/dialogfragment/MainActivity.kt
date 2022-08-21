package com.example.dialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rateMeTextView = findViewById<TextView>(R.id.rateMeTextView)
        rateMeTextView.setOnClickListener() {
            val dialog = CustomDialogFragment()

            dialog.show(supportFragmentManager,"customDialog")
        }
    }
}