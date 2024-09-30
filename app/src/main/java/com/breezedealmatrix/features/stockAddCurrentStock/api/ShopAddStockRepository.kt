package com.breezedealmatrix.features.stockAddCurrentStock.api

import com.breezedealmatrix.base.BaseResponse
import com.breezedealmatrix.features.location.model.ShopRevisitStatusRequest
import com.breezedealmatrix.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezedealmatrix.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezedealmatrix.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezedealmatrix.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}