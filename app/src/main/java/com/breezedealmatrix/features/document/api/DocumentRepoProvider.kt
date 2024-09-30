package com.breezedealmatrix.features.document.api

import com.breezedealmatrix.features.dymanicSection.api.DynamicApi
import com.breezedealmatrix.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}