package com.example.myfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class UserInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

        val btn: Button =findViewById(R.id.button5)
        btn.setOnClickListener(){
            Toast.makeText(this, "Let's see what's in The menu now!", Toast.LENGTH_SHORT)
                .show()

            val intent6 = Intent(this,Menu::class.java)
            startActivity(intent6)
        }

    }
}