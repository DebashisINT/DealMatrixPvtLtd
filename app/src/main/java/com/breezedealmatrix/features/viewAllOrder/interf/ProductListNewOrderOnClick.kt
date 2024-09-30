package com.breezedealmatrix.features.viewAllOrder.interf

import com.breezedealmatrix.app.domain.NewOrderGenderEntity
import com.breezedealmatrix.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}