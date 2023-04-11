package com.example.didemo

class UserRegistrationService {

    private val userRepository = UserRepository()
    private val emailService = EmailService()

    fun registerUser(email:String, password:String){
        userRepository.saveUser(email, password)
        emailService.send(email, "no-reply@bilawal.com", "User Registered")
    }
}