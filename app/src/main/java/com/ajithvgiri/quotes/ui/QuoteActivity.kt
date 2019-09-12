package com.ajithvgiri.quotes.ui

import android.os.Bundle
import com.ajithvgiri.quotes.R
import dagger.android.support.DaggerAppCompatActivity

class QuoteActivity : DaggerAppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote)

    }
}
