package com.ajithvgiri.quotes.di.modules

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
class AppModules {

    companion object {
        const val BASE_URL = "http://quotes.stormconsultancy.co.uk/"
    }

    @Provides
    fun providesMoshiConverterFactory(): MoshiConverterFactory = MoshiConverterFactory.create()

    @Provides
    fun providesRetrofit(moshiConverterFactory: MoshiConverterFactory): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(moshiConverterFactory)
                .build()
    }

}