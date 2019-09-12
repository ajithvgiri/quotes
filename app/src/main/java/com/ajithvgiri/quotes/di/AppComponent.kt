package com.ajithvgiri.quotes.di

import com.ajithvgiri.quotes.QuotesApplication
import com.ajithvgiri.quotes.di.modules.ActivityModule
import com.ajithvgiri.quotes.di.modules.AppModules
import com.ajithvgiri.quotes.di.modules.ViewModelModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule


@Component(
        modules = [AndroidInjectionModule::class,
            AndroidSupportInjectionModule::class,
            AppModules::class,
            ActivityModule::class,
            ViewModelModule::class]
)
interface AppComponent : AndroidInjector<QuotesApplication>