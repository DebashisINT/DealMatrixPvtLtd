package com.breezedealmatrix.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezedealmatrix.app.FileUtils
import com.breezedealmatrix.app.Pref
import com.breezedealmatrix.base.BaseResponse
import com.breezedealmatrix.features.addshop.model.AddLogReqData
import com.breezedealmatrix.features.addshop.model.AddShopRequestData
import com.breezedealmatrix.features.addshop.model.AddShopResponse
import com.breezedealmatrix.features.addshop.model.LogFileResponse
import com.breezedealmatrix.features.addshop.model.UpdateAddrReq
import com.breezedealmatrix.features.contacts.CallHisDtls
import com.breezedealmatrix.features.contacts.CompanyReqData
import com.breezedealmatrix.features.contacts.ContactMasterRes
import com.breezedealmatrix.features.contacts.SourceMasterRes
import com.breezedealmatrix.features.contacts.StageMasterRes
import com.breezedealmatrix.features.contacts.StatusMasterRes
import com.breezedealmatrix.features.contacts.TypeMasterRes
import com.breezedealmatrix.features.dashboard.presentation.DashboardActivity
import com.breezedealmatrix.features.login.model.WhatsappApiData
import com.breezedealmatrix.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}