package com.ajithvgiri.quotes.di.modules

import com.ajithvgiri.quotes.ui.QuoteActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeQuoteActivity(): QuoteActivity

}
