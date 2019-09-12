package com.ajithvgiri.quotes.ui

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.ajithvgiri.quotes.R
import com.ajithvgiri.quotes.di.ViewModelFactory
import com.ajithvgiri.quotes.viewmodel.QuoteViewModel
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_quote.*
import javax.inject.Inject

class QuoteActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var hello: String

    @Inject
    lateinit var providerFactory: ViewModelFactory


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote)


        println("this is the message from $hello")

        // Initialization of ViewModel class
        val quoteViewModel = ViewModelProviders.of(this, providerFactory).get(QuoteViewModel::class.java)

        swipeRefreshLayout.setOnRefreshListener {
            quoteViewModel.getRandomQuotesFromServer()
        }


        // Observe the Quote Live data object for the changes
        quoteViewModel.quote.observe(this, Observer {

            if (it != null) {
                //bind the quote value from the "quoteModel" object to the textView
                textViewQuote.text = it.quote
                //set the isRefreshing value to false for not showing the progressbar in the UI
                swipeRefreshLayout.isRefreshing = false
            }
        })

    }
}
