package com.breezedealmatrix.features.viewPPDDStock.api

import com.breezedealmatrix.app.NetworkConstant
import com.breezedealmatrix.base.BaseResponse
import com.breezedealmatrix.features.viewPPDDStock.model.UpdateStockInputParamsModel
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by Saikat on 05-10-2018.
 */
interface UpdateStockApi {

    @POST("StockInfo/UpdateStock")
    fun updateStock(@Body updateStock: UpdateStockInputParamsModel?): Observable<BaseResponse>

    /**
     * Companion object to create the ShopDurationApi
     */
    companion object Factory {
        fun create(): UpdateStockApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOutNoRetry())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(UpdateStockApi::class.java)
        }
    }
}