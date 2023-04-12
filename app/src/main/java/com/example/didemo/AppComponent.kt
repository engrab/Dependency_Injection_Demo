package com.example.didemo

import dagger.Component

@Component(modules = [AnalyticsModule::class])
interface AppComponent {

    fun getAnalaytics():AnalyticsService
}