package com.example.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Registration2 : AppCompatActivity() {

    lateinit var PasswordTextview: TextView
    lateinit var FINALPAGEButton : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration2)

        PasswordTextview = findViewById(R.id.editText4)
        FINALPAGEButton = findViewById(R.id.FINALPAGE)

        val Name : String? = intent?.extras?.getString("NAME")
        val Surname : String? =  intent?.extras?.getString("SURNAME")
        val Age : Int? =  intent?.extras?.getInt("AGE")
        val Email : String? =  intent?.extras?.getString("EMAIL")




        FINALPAGEButton.setOnClickListener {


            val Password: Int = PasswordTextview.text.toString().toInt()





            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("NAME",Name)
            intent.putExtra("SURNAME",Surname)
            intent.putExtra("AGE",Age)
            intent.putExtra("EMAIL",Email)
            intent.putExtra("PASSWORD",Password)
            startActivity(intent)



        }





    }
}