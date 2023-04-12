package com.example.didemo

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@ActivityScope
@Subcomponent(modules = [NotificationServiceModule::class, UserRepositoryModule::class])
interface UserRegistrationComponent {

    // inject consumer in inject method which return all method that are required to MainActivity
    fun inject(mainActivity: MainActivity)

    fun getEmailService():EmailService

    // Component.Builder or Subcomponent.Builder
    //build --> Component
    // Method --> Builder
    @Subcomponent.Builder
    interface Builder{
        fun build():UserRegistrationComponent
        fun retryCount(@BindsInstance retryCount: Int):Builder

    }
}