package com.example.didemo

import android.util.Log
import com.example.didemo.Constants.Companion.TAG
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email: String, password: String)
}


class SQLRepository @Inject constructor(private val analyticsService: AnalyticsService):UserRepository{
    override fun saveUser(email:String, password:String){
        Log.d(TAG, "User save to DB")
        analyticsService.trackEvent("Save User", "CREATE")
    }
}

class FirebaseRepository(private val analyticsService: AnalyticsService) : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User save to firebase")
        analyticsService.trackEvent("Save User", "Create")

    }

}