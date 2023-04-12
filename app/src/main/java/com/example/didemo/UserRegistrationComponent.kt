package com.example.didemo

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [NotificationServiceModule::class, UserRepositoryModule::class])
interface UserRegistrationComponent {

    // inject consumer in inject method which return all method that are required to MainActivity
    fun inject(mainActivity: MainActivity)

    fun getEmailService():EmailService

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int):UserRegistrationComponent
    }
}