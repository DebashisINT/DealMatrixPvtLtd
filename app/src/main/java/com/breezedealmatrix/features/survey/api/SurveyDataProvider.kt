package com.breezedealmatrix.features.survey.api

import com.breezedealmatrix.features.photoReg.api.GetUserListPhotoRegApi
import com.breezedealmatrix.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}