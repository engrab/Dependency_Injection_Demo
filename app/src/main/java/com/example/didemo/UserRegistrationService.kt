package com.example.didemo

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val SQLRepository: UserRepository,
    private val emailService: NotificationService
) {

    fun registerUser(email: String, password: String) {
        SQLRepository.saveUser(email, password)
        emailService.send(email, "no-reply@bilawal.com", "User Registered")
    }
}