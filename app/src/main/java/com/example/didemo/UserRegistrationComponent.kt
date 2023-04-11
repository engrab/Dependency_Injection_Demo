package com.example.didemo

import dagger.Component

@Component(modules = [NotificationServiceModule::class, UserRepositoryModule::class])
interface UserRegistrationComponent {

    // inject consumer in inject method which return all method that are required to MainActivity
    fun inject(mainActivity: MainActivity)
}