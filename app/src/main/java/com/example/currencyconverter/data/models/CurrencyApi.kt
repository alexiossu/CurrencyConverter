package com.example.currencyconverter.data.models

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("/latest?access_key=4893e507762918b465162769c8955882")
    suspend fun getRates(
        @Query("base") base: String
    ): Response<CurrencyResponse>
}