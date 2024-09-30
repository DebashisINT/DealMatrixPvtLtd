package com.breezedealmatrix.features.location.shopRevisitStatus

import com.breezedealmatrix.base.BaseResponse
import com.breezedealmatrix.features.location.model.ShopDurationRequest
import com.breezedealmatrix.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}