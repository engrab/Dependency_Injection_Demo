package com.example.didemo

import dagger.Component

@Component(modules = [AnalyticsModule::class])
interface AppComponent {

    fun userRegistrationFactory():UserRegistrationComponent.Factory
}