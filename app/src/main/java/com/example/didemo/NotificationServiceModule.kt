package com.example.didemo

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule(private val retryCount:Int) {

    // provide object of class
    @MessageQualifier
    @Provides
    fun getMessageService():NotificationService{
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }
}