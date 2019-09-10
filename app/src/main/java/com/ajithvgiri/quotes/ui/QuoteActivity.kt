package com.ajithvgiri.quotes.ui

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.ajithvgiri.quotes.R
import com.ajithvgiri.quotes.viewmodel.QuoteViewModel
import kotlinx.android.synthetic.main.activity_quote.*
import kotlin.random.Random

class QuoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote)

        // Initialization of ViewModel class
        val quoteViewModel = ViewModelProviders.of(this).get(QuoteViewModel::class.java)


        swipeRefreshLayout.setOnRefreshListener {

            // generate a random number between 0 to 10
            val random = Random.nextInt(quoteViewModel.quotesList.size) + 0

            //get the quote list item from the "quoteList" initialized in "QuoteViewModel.kt" class
            // and pass the random number to the index of the "quoteList"
            val quoteModel = quoteViewModel.quotesList[random]

            //bind the quote value from the "quoteModel" object to the textView
            textViewQuote.text = quoteModel.quote

            //set the isRefreshing value to false for not showing the progressbar in the UI
            swipeRefreshLayout.isRefreshing = false
        }

    }
}
