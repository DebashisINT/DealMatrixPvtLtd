package com.breezedealmatrix.features.viewAllOrder.model

import com.breezedealmatrix.app.domain.NewOrderColorEntity
import com.breezedealmatrix.app.domain.NewOrderGenderEntity
import com.breezedealmatrix.app.domain.NewOrderProductEntity
import com.breezedealmatrix.app.domain.NewOrderSizeEntity
import com.breezedealmatrix.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

