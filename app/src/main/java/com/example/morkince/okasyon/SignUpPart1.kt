package com.example.morkince.okasyon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up_part1.*

class SignUpPart1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_part1)
        img_btn_next.setOnClickListener {
            val intent = Intent(this, SignUpPart2::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}
