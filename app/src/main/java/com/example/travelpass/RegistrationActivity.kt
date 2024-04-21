package com.example.travelpass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration_page)

        val RegisterNow=findViewById<Button>(R.id.button3)
        val logPage=findViewById<Button>(R.id.button4)

        RegisterNow.setOnClickListener {
            val explicitIntent = Intent(this,LoginActivity::class.java)
            startActivity(explicitIntent)
            finish()
        }
        logPage.setOnClickListener {
            val explicitIntent = Intent(this,LoginActivity::class.java)
            startActivity(explicitIntent)
            finish()
        }
    }
}