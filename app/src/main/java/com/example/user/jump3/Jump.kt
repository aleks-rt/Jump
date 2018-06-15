package com.example.user.jump3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_jump.*

class Jump : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jump)
        tapToStart.setOnClickListener{
            val intent = Intent(this,Menu::class.java)
            startActivity(intent)
        }
    }


}
