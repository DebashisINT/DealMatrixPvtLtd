package com.breezedealmatrix.features.location.shopRevisitStatus

import com.breezedealmatrix.features.location.shopdurationapi.ShopDurationApi
import com.breezedealmatrix.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}