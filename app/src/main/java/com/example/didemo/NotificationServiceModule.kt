package com.example.didemo

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    // provide object of class
    @MessageQualifier
    @Provides
    fun getMessageService():NotificationService{
        return MessageService(3)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }
}