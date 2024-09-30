package com.breezedealmatrix.features.activities.api

import com.breezedealmatrix.features.member.api.TeamApi
import com.breezedealmatrix.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}