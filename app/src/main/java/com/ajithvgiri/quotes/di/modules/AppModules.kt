package com.ajithvgiri.quotes.di.modules

import dagger.Module
import dagger.Provides

@Module
class AppModules {

    @Provides
    fun providesString(): String = "Hello world!"

}