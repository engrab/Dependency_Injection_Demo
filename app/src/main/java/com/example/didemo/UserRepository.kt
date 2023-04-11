package com.example.didemo

import android.util.Log
import com.example.didemo.Constants.Companion.TAG
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(email:String, password:String){
        Log.d(TAG, "User save to DB")
    }
}