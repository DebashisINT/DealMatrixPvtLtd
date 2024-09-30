package com.breezedealmatrix.features.menuBeat

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezedealmatrix.app.FileUtils
import com.breezedealmatrix.app.Pref
import com.breezedealmatrix.base.BaseResponse
import com.breezedealmatrix.features.addshop.model.*
import com.breezedealmatrix.features.addshop.model.assigntopplist.AddShopUploadImg
import com.breezedealmatrix.features.addshop.model.assigntopplist.AddshopImageMultiReqbody1
import com.breezedealmatrix.features.addshop.presentation.ShopListSubmitResponse
import com.breezedealmatrix.features.addshop.presentation.multiContactRequestData
import com.breezedealmatrix.features.beatCustom.BeatGetStatusModel
import com.breezedealmatrix.features.dashboard.presentation.DashboardActivity
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by saheli on 16-12-2023.
 */
class MenuBeatRepository(val apiService: MenuBeatApi) {

    fun currentTabMenubeat(sessiontoken: String, user_id: String, beat_id: String): Observable<MenuBeatResponse> {
        return apiService.getCurrentTabData(user_id,sessiontoken,beat_id)
    }
    fun hirerchyTabMenubeat(sessiontoken: String, user_id: String): Observable<MenuBeatAreaRouteResponse> {
        return apiService.getHirerchyTabData(user_id,sessiontoken)
    }

}