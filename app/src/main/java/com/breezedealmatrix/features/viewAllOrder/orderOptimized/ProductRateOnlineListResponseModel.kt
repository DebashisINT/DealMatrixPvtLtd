package com.breezedealmatrix.features.viewAllOrder.orderOptimized

import com.breezedealmatrix.app.domain.ProductOnlineRateTempEntity
import com.breezedealmatrix.base.BaseResponse
import com.breezedealmatrix.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}