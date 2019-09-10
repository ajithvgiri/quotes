package com.ajithvgiri.quotes.network

import com.ajithvgiri.quotes.model.Quote
import retrofit2.Call
import retrofit2.http.GET


interface ApiInterface {

    @GET("quotes.json")
    fun getQuotes(): Call<List<Quote>>

}