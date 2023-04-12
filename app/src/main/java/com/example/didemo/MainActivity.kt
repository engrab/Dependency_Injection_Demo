package com.example.didemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    // this is field injection here we mension all object of that class which are created from dagger
    @Inject
    lateinit var userRegistrationService: UserRegistrationService


    // for singlton scope you mension @Singleton on return type object and its component
    @Inject
    lateinit var emailService: EmailService

    @Inject
    lateinit var emailService2: EmailService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = (application as UserApplication).appComponent
        val userRegistrationComponent = component.userRegistration()
        userRegistrationComponent.inject(this)// return all method with are required to MainActivity that are created by dagger
        userRegistrationService.registerUser("bilawal@gmail.com", "12345")

    }
}