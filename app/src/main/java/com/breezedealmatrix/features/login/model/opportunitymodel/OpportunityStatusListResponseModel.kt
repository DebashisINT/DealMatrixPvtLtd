package com.breezedealmatrix.features.login.model.opportunitymodel

import com.breezedealmatrix.app.domain.OpportunityStatusEntity
import com.breezedealmatrix.app.domain.ProductListEntity
import com.breezedealmatrix.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}