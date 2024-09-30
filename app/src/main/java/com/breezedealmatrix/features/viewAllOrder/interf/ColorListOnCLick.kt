package com.breezedealmatrix.features.viewAllOrder.interf

import com.breezedealmatrix.app.domain.NewOrderGenderEntity
import com.breezedealmatrix.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}