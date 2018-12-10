package com.example.morkince.okasyon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_sign_up_part2.*

class SignUpPart2 : AppCompatActivity() {
    var gender = arrayOf( "Male", "Female")

    var spinner: Spinner? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_part2)
        img_btn_back.setOnClickListener {
            val intent = Intent(this, SignUpPart1::class.java)
            // start your next activity
            startActivity(intent)
        }
        img_btn_next1.setOnClickListener {
            val intent = Intent(this,Summary::class.java)
            // start your next activity
            startActivity(intent)
        }
        spinner = this.Spinner

        // Create an ArrayAdapter using a simple spinner layout and languages array
        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, gender)
        // Set layout to use when the list of choices appear
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Set Adapter to Spinner
        spinner!!.setAdapter(aa)
    }
}
