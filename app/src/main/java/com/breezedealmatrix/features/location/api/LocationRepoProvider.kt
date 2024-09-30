package com.breezedealmatrix.features.location.api

import com.breezedealmatrix.features.location.shopdurationapi.ShopDurationApi
import com.breezedealmatrix.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}