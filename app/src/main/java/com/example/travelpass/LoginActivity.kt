package com.example.travelpass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        //Explicit Intent
        val explicitButton = findViewById<Button>(R.id.register_button)
        val log1=findViewById<Button>(R.id.login_button1)

        explicitButton.setOnClickListener {
            val explicitIntent = Intent(this,RegistrationActivity::class.java)
            startActivity(explicitIntent)
            finish()
        }
        log1.setOnClickListener {
            val explicitIntent = Intent(this,NavigationActivity::class.java)
            startActivity(explicitIntent)
            finish()
        }
    }
}