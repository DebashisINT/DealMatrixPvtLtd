package com.breezedealmatrix.features.viewAllOrder.interf

import com.breezedealmatrix.app.domain.NewOrderGenderEntity
import com.breezedealmatrix.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}