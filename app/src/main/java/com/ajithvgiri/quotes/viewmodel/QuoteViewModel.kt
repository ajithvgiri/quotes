package com.ajithvgiri.quotes.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.ajithvgiri.quotes.model.Quote
import com.ajithvgiri.quotes.network.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


class QuoteViewModel : ViewModel() {

    companion object {
        const val TAG = "QuotesViewModel"
        const val BASE_URL = "http://quotes.stormconsultancy.co.uk/"
    }

    var quotesList = ArrayList<Quote>()

    init {
        // Initializing retrofit class with BASE_URL
        val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(MoshiConverterFactory.create()).build()

        val call = retrofit.create(ApiInterface::class.java).getQuotes()

        call.enqueue(object : Callback<List<Quote>> {

            override fun onFailure(call: Call<List<Quote>>, t: Throwable) {
                Log.e(TAG, "onFailure at call.enqueue :-  ${t.message} ")
            }

            override fun onResponse(call: Call<List<Quote>>, response: Response<List<Quote>>) {
                if (response.isSuccessful && response.body()?.isNotEmpty() == true) {
                    // bind the response body to the "quotesList"
                    quotesList = response.body() as ArrayList<Quote>
                }
            }

        })
    }
}