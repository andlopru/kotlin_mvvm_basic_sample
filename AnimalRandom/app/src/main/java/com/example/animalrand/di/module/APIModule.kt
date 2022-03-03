package com.example.animalrand.di.module

import com.example.animalrand.api.ApiInterface
import com.example.animalrand.utils.general.Constants.Retrofit.BASE_URL
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class APIModule {
    @Singleton
    @Provides
    fun providesRetrofit(client: OkHttpClient):ApiInterface{
        return Retrofit.Builder().apply {
            client(client)
            addConverterFactory(GsonConverterFactory.create())
            baseUrl(BASE_URL)
        }
            .build()
            .create(ApiInterface::class.java)
    }

    @Singleton
    @Provides
    fun providesOkHttpClient():OkHttpClient{
//        In case we need to emulate a response from the server, with local data

//        val mockInterceptorAPI = mockInterceptor {
//            useDynamicMocks(mockedAPI string with json format)
//            setInterceptorStatus(Mode.DISABLED)
//        }
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        return OkHttpClient().newBuilder().apply {
            addInterceptor(httpLoggingInterceptor)
        }.build()

    }
}

