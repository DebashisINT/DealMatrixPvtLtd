package com.breezedealmatrix.features.photoReg.present

import com.breezedealmatrix.app.domain.ProspectEntity
import com.breezedealmatrix.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}