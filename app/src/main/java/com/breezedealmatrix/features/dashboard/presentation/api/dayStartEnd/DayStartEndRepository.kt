package com.breezedealmatrix.features.dashboard.presentation.api.dayStartEnd

import com.breezedealmatrix.app.Pref
import com.breezedealmatrix.base.BaseResponse
import com.breezedealmatrix.features.dashboard.presentation.model.DaystartDayendRequest
import com.breezedealmatrix.features.dashboard.presentation.model.StatusDayStartEnd
import com.breezedealmatrix.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezedealmatrix.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }

    fun daystartendDelete(sessionToken:String,usrID:String,date:String,dayStDel:String,dayEndDel:String): Observable<BaseResponse> {
        return apiService.submitDayStartEndDelApi(sessionToken,usrID,date,dayStDel,dayEndDel)
    }


}