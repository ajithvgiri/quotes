package com.ajithvgiri.quotes.di

import com.ajithvgiri.quotes.QuotesApplication
import com.ajithvgiri.quotes.di.modules.ActivityModule
import com.ajithvgiri.quotes.di.modules.AppModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule


@Component(
        modules = [AndroidInjectionModule::class,
            AndroidSupportInjectionModule::class,
            AppModule::class,
            ActivityModule::class]
)
interface AppComponent : AndroidInjector<QuotesApplication>