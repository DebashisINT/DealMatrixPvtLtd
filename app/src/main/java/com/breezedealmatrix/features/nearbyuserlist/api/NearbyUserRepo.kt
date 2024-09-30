package com.breezedealmatrix.features.nearbyuserlist.api

import com.breezedealmatrix.app.Pref
import com.breezedealmatrix.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezedealmatrix.features.newcollection.model.NewCollectionListResponseModel
import com.breezedealmatrix.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}