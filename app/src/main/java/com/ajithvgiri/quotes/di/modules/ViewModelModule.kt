package com.ajithvgiri.quotes.di.modules

import androidx.lifecycle.ViewModel
import com.ajithvgiri.quotes.di.ViewModelKey
import com.ajithvgiri.quotes.viewmodel.QuoteViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(QuoteViewModel::class)
    abstract fun bindQuoteViewModel(quoteViewModel: QuoteViewModel): ViewModel


}

