package com.example.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var NameTextview: TextView
    lateinit var SurnameTextview: TextView
    lateinit var Nextpagebutton: Button
    lateinit var  AgeTextview: TextView
    lateinit var EmailTextview: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    NameTextview = findViewById(R.id.editText)
    SurnameTextview = findViewById(R.id.editText2)
    Nextpagebutton = findViewById(R.id.NEXTPAGE)
    AgeTextview = findViewById(R.id.editText3)
    EmailTextview = findViewById(R.id.editText5)


    Nextpagebutton.setOnClickListener {
        val Name : String = NameTextview.text.toString()
        val Surname : String = SurnameTextview.text.toString()
        val Age : Int = AgeTextview.text.toString().toInt()
        val Email : String = EmailTextview.text.toString()






        val intent = Intent(this,Registration2::class.java)
        intent.putExtra("NAME",Name)
        intent.putExtra("SURNAME",Surname)
        intent.putExtra("AGE",Age)
        intent.putExtra("EMAIL",Email)

        startActivity(intent)

    }


    }
}