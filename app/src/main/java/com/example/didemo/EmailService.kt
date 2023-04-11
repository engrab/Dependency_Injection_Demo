package com.example.didemo

import android.util.Log
import com.example.didemo.Constants.Companion.TAG

class EmailService {
    fun send(to:String, from:String, body:String?){
        Log.d(TAG, "Email Sent")
    }
}