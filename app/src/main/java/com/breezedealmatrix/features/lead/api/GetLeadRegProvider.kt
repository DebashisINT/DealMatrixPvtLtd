package com.breezedealmatrix.features.lead.api

import com.breezedealmatrix.features.NewQuotation.api.GetQuotListRegRepository
import com.breezedealmatrix.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}