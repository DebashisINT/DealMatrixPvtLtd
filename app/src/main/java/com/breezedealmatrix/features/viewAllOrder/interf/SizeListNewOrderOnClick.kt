package com.breezedealmatrix.features.viewAllOrder.interf

import com.breezedealmatrix.app.domain.NewOrderProductEntity
import com.breezedealmatrix.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}