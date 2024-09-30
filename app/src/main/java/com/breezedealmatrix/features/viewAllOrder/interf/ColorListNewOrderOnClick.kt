package com.breezedealmatrix.features.viewAllOrder.interf

import com.breezedealmatrix.app.domain.NewOrderColorEntity
import com.breezedealmatrix.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}