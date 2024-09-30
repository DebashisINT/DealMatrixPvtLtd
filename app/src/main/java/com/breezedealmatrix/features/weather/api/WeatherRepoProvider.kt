package com.breezedealmatrix.features.weather.api

import com.breezedealmatrix.features.task.api.TaskApi
import com.breezedealmatrix.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}