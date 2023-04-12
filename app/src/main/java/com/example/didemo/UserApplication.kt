package com.example.didemo

import android.app.Application

class UserApplication:Application() {


    // initialize component in application class Now it return same object in every activity.
    // it is singleton in application level.
    lateinit var userRegistrationComponent: UserRegistrationComponent
    override fun onCreate() {
        super.onCreate()

        userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3)
    }
}