package com.breezedealmatrix.features.dashboard.presentation.api.dayStartEnd

import com.breezedealmatrix.features.stockCompetetorStock.api.AddCompStockApi
import com.breezedealmatrix.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}