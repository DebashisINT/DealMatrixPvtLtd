package com.breezedealmatrix.features.newcollectionreport

import com.breezedealmatrix.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}