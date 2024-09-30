package com.breezedealmatrix.features.weather.api

import com.breezedealmatrix.base.BaseResponse
import com.breezedealmatrix.features.task.api.TaskApi
import com.breezedealmatrix.features.task.model.AddTaskInputModel
import com.breezedealmatrix.features.weather.model.ForeCastAPIResponse
import com.breezedealmatrix.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}