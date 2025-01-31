package com.breezedealmatrix.features.dashboard.presentation.api.submithomeloc

import com.breezedealmatrix.app.NetworkConstant
import com.breezedealmatrix.base.BaseResponse
import com.breezedealmatrix.features.dashboard.presentation.model.SubmitHomeLocationInputModel
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by Saikat on 13-03-2019.
 */
interface SubmitHomeLocationApi {

    @POST("UserLogin/SubmitHomeLocation")
    fun submitHomeLocation(@Body submitHomeLoc: SubmitHomeLocationInputModel): Observable<BaseResponse>

    /**
     * Companion object to create the GithubApiService
     */
    companion object Factory {
        fun create(): SubmitHomeLocationApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(SubmitHomeLocationApi::class.java)
        }
    }
}