package com.example.didemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()
        val userRegistrationService = component.getUserRegistrationService()
        val emailService = component.getEmailService()
        emailService.send("abcd@gmail.com", "bilawal@gmail.com", "Congregation Hi You are register")
        userRegistrationService.registerUser("bilawal@gmail.com", "12345")
    }
}