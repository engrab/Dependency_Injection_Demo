package com.example.didemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    // this is field injection here we mension all object of that class which are created from dagger
    @Inject
    lateinit var userRegistrationService: UserRegistrationService
    // this is field injection here we mension all object of that class which are created from dagger
    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()
       component.inject(this)// return all method with are required to MainActivity that are created by dagger
        emailService.send("abcd@gmail.com", "bilawal@gmail.com", "Congregation you are registered")
        userRegistrationService.registerUser("bilawal@gmail.com", "12345")
    }
}