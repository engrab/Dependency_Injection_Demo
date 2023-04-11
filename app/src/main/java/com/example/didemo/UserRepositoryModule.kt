package com.example.didemo

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {

     // check if dagger create object in paramter then you can return that object.
    // simple we bind sqlRepository to UserRepository
//     @Provides
//    fun getSQLRepository(sqlRepository: SQLRepository):UserRepository{
//        return sqlRepository
//    }



    // if dagger can create object of class that is in paramater in fun then we use
    // binds for only binding parameter to return type
    // all fun which use binds are abstract
    @Binds
    abstract fun getSQLRepository(sqlRepository: SQLRepository):UserRepository
}