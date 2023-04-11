package com.example.didemo

import android.util.Log
import com.example.didemo.Constants.Companion.TAG
import javax.inject.Inject

interface NotificationService{
    fun send(to: String, from: String, body: String?)
}

class EmailService @Inject constructor():NotificationService{
    override fun send(to:String, from:String, body:String?){
        Log.d(TAG, "Email Sent")
    }
}

class MessageService(private val retryCount:Int) : NotificationService{
    override fun send(to: String, from: String, body: String?) {
        Log.d(TAG, "Message Sent--- retry count = $retryCount")
    }

}