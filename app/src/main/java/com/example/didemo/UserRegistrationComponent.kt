package com.example.didemo

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService():UserRegistrationService

    fun getEmailService():EmailService
}