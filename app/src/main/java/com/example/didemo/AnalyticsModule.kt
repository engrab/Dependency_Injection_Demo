package com.example.didemo

import dagger.Module
import dagger.Provides

@Module
class AnalyticsModule {

    @Provides
    fun getAnalayticsService() : AnalyticsService{
        return Mixpanel()
    }
}