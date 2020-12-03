package com.example.desafiocrizza.data.api

import com.example.desafiocrizza.GitApplication.Companion.applicationContext
import com.example.desafiocrizza.data.api.APIGitHub.Companion.BASE_URL
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ApiClient {

    val context = applicationContext()
    private val okHttpClient = OkHttpClient.Builder()
        .readTimeout(30, TimeUnit.SECONDS)
        .connectTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

    private val getRetrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

    val apiGitHub: APIGitHub = getRetrofit.create(APIGitHub::class.java)
}