package com.example.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Registration3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration3)


        findViewById<TextView>(R.id.textView).text = intent.extras?.getString("NAME")
        findViewById<TextView>(R.id.textView2).text = intent.extras?.getString("SURNAME")
        findViewById<TextView>(R.id.textView3).text = intent.extras?.getString("AGE")
        findViewById<TextView>(R.id.textView4).text = intent.extras?.getString("EMAIL")
        findViewById<TextView>(R.id.textView5).text = intent.extras?.getString("PASSWORD")











    }



}