package com.test.kotlinapicallingusingretrofit

import retrofit2.Call
import retrofit2.http.GET

interface ApInterface {

    @GET("posts")
    fun getData():Call<DataModel>
}