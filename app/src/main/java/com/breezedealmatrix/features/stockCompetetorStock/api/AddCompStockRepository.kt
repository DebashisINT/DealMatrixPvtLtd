package com.breezedealmatrix.features.stockCompetetorStock.api

import com.breezedealmatrix.base.BaseResponse
import com.breezedealmatrix.features.orderList.model.NewOrderListResponseModel
import com.breezedealmatrix.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezedealmatrix.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}