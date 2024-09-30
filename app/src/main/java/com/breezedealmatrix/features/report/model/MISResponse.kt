package com.breezedealmatrix.features.report.model

import com.breezedealmatrix.base.BaseResponse
import com.breezedealmatrix.features.nearbyshops.model.ShopData

/**
 * Created by Pratishruti on 27-12-2017.
 */
class MISResponse:BaseResponse() {
    var shop_list:List<ShopData>? = null
    var shop_list_count:MISShopListCount?=null
}