package com.ajithvgiri.quotes.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.ajithvgiri.quotes.R
import com.ajithvgiri.quotes.viewmodel.QuoteViewModel
import kotlinx.android.synthetic.main.activity_quote.*

class QuoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote)

        // Initialization of ViewModel class
        val quoteViewModel = ViewModelProviders.of(this).get(QuoteViewModel::class.java)


        swipeRefreshLayout.setOnRefreshListener {

            //bind the quote value from the "quoteModel" object to the textView
            textViewQuote.text = quoteViewModel.getRandomQuotes()?.quote

            //set the isRefreshing value to false for not showing the progressbar in the UI
            swipeRefreshLayout.isRefreshing = false
        }

    }
}
