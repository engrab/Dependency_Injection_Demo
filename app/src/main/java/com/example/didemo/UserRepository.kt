package com.example.didemo

import android.util.Log
import com.example.didemo.Constants.Companion.TAG

class UserRepository {
    fun saveUser(email:String, password:String){
        Log.d(TAG, "User save to DB")
    }
}