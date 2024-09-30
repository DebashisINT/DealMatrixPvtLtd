package com.breezedealmatrix.features.newcollection.model

import com.breezedealmatrix.app.domain.CollectionDetailsEntity
import com.breezedealmatrix.base.BaseResponse
import com.breezedealmatrix.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}