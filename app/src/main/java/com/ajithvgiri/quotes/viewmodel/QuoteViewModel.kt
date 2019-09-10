package com.ajithvgiri.quotes.viewmodel

import androidx.lifecycle.ViewModel
import com.ajithvgiri.quotes.model.Quote
import kotlin.random.Random


class QuoteViewModel : ViewModel() {

    private val quotesList = ArrayList<Quote>()

    init {
        // generating dummy data for quote list
        for (i in 0..10) {
            val quote = Quote(i, "Quote $i", "author $i")
            quotesList.add(quote)
        }
    }

    fun getRandomQuotes(): Quote? {
        // generate a random number between 0 to 10
        val random = Random.nextInt(10) + 0

        //get the quote list item from the "quoteList" initialized in "QuoteViewModel.kt" class
        // and pass the random number to the index of the "quoteList"
        return quotesList[random]
    }
}