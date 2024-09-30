package com.breezedealmatrix.features.mylearning.apiCall

import com.breezedealmatrix.features.login.api.opportunity.OpportunityListApi
import com.breezedealmatrix.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}