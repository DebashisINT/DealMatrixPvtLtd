package com.breezedealmatrix.features.orderhistory.api

import com.breezedealmatrix.app.NetworkConstant
import com.breezedealmatrix.base.BaseResponse
import com.breezedealmatrix.features.orderhistory.model.LocationUpdateRequest
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by Pratishruti on 23-11-2017.
 */
interface LocationUpdateApi {
    @POST("LocationCapture/Sendlocation")
    fun sendLocationUpdates(@Body location: LocationUpdateRequest?): Observable<BaseResponse>

    /**
     * Companion object to create the GithubApiService
     */
    companion object Factory {
        fun create(): LocationUpdateApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setNewTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(LocationUpdateApi::class.java)
        }
    }

}