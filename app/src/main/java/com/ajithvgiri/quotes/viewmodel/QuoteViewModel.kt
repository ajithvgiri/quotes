package com.ajithvgiri.quotes.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ajithvgiri.quotes.model.Quote
import com.ajithvgiri.quotes.network.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject


class QuoteViewModel @Inject constructor(var retrofit: Retrofit) : ViewModel() {


    companion object {
        const val TAG = "QuotesViewModel"
    }


    var quote = MutableLiveData<Quote>()


    init {
        getRandomQuotesFromServer()
    }

    fun getRandomQuotesFromServer() {
        val call = retrofit.create(ApiInterface::class.java).getRandomQuotes()
        call.enqueue(object : Callback<Quote> {
            override fun onFailure(call: Call<Quote>, t: Throwable) {
                Log.e(TAG, "onFailure at call.enqueue :-  ${t.message} ")
            }

            override fun onResponse(call: Call<Quote>, response: Response<Quote>) {
                // bind the response body to the "quotesList"
                if (response.isSuccessful && response.body() != null) {
                    quote.value = response.body()
                }
            }
        })
    }

}