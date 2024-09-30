package com.breezedealmatrix.features.addAttendence.api.leavetytpeapi

import com.breezedealmatrix.app.Pref
import com.breezedealmatrix.base.BaseResponse
import com.breezedealmatrix.features.addAttendence.model.ApprovalLeaveResponseModel
import com.breezedealmatrix.features.addAttendence.model.LeaveTypeResponseModel
import com.breezedealmatrix.features.leaveapplynew.model.ApprovalRejectReqModel
import com.breezedealmatrix.features.leaveapplynew.model.clearAttendanceonRejectReqModelRejectReqModel
import io.reactivex.Observable

/**
 * Created by Saikat on 22-11-2018.
 */
class LeaveTypeRepo(val apiService: LeaveTypeApi) {
    fun getLeaveTypeList(): Observable<LeaveTypeResponseModel> {
        return apiService.getLeaveTypeList(Pref.session_token!!, Pref.user_id!!)
    }


    fun getApprovalLeaveList(userId:String): Observable<ApprovalLeaveResponseModel> {
        return apiService.getApprovalLeaveList(Pref.session_token!!,userId)
    }

    fun postApprovalRejectclick(ApprovalRejectReqModel: ApprovalRejectReqModel): Observable<BaseResponse> {
        return apiService.postApprovalRejectclick(ApprovalRejectReqModel)
    }

    fun clearAttendanceonRejectclick(clearAttendanceonRejectReModel: clearAttendanceonRejectReqModelRejectReqModel): Observable<BaseResponse> {
        return apiService.clearAttendanceonRejectclick(clearAttendanceonRejectReModel)
    }
}