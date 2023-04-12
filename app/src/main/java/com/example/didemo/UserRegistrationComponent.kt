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

//    @Subcomponent.Factory
//    interface Factory{
//        fun create(@BindsInstance retryCount:Int):UserRegistrationComponent
//    }
}