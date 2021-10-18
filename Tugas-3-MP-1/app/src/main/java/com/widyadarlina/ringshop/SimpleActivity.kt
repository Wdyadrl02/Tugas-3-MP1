package com.widyadarlina.ringshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_simple.*

class SimpleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)

        btn_back.setOnClickListener {
            val backIntent = Intent(this@SimpleActivity, MainActivity::class.java)
            startActivity(backIntent)
        }
    }
}