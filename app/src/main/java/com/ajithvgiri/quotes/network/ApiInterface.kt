package com.ajithvgiri.quotes.network

import com.ajithvgiri.quotes.model.Quote
import retrofit2.Call
import retrofit2.http.GET


interface ApiInterface {

    @GET("random.json")
    fun getRandomQuotes(): Call<Quote>

}