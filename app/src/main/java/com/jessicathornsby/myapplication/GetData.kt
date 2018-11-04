package com.jessicathornsby.myapplication
import io.reactivex.Observable
import retrofit2.http.GET


interface GetData {

    @GET("prices?key=YOUR-API-KEY-HERE")
    fun getData() : Observable<List<RetroCrypto>>

}
