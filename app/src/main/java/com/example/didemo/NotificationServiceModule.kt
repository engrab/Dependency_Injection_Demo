package com.example.didemo

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    // provide object of class
    @Provides
    fun getMessageService():NotificationService{
        return MessageService()
    }
}