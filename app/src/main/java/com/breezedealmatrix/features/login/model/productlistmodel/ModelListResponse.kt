package com.breezedealmatrix.features.login.model.productlistmodel

import com.breezedealmatrix.app.domain.ModelEntity
import com.breezedealmatrix.app.domain.ProductListEntity
import com.breezedealmatrix.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}