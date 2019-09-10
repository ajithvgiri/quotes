package com.ajithvgiri.quotes.viewmodel

import androidx.lifecycle.ViewModel
import com.ajithvgiri.quotes.model.Quote


class QuoteViewModel : ViewModel() {

    val quotesList = ArrayList<Quote>()

    init {
        for (i in 0..10) {
            val quote = Quote(i, "Quote $i", "author $i")
            quotesList.add(quote)
        }
    }
}