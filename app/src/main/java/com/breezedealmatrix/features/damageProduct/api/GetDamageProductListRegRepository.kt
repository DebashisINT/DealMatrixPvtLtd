package com.breezedealmatrix.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezedealmatrix.app.FileUtils
import com.breezedealmatrix.base.BaseResponse
import com.breezedealmatrix.features.NewQuotation.model.*
import com.breezedealmatrix.features.addshop.model.AddShopRequestData
import com.breezedealmatrix.features.addshop.model.AddShopResponse
import com.breezedealmatrix.features.damageProduct.model.DamageProductResponseModel
import com.breezedealmatrix.features.damageProduct.model.delBreakageReq
import com.breezedealmatrix.features.damageProduct.model.viewAllBreakageReq
import com.breezedealmatrix.features.login.model.userconfig.UserConfigResponseModel
import com.breezedealmatrix.features.myjobs.model.WIPImageSubmit
import com.breezedealmatrix.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}