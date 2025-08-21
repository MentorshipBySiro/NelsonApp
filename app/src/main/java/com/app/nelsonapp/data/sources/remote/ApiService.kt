package com.app.nelsonapp.data.sources.remote

import androidx.annotation.Keep
import com.app.nelsonapp.core.utils.ApiConstants
import com.app.nelsonapp.data.models.Fruit
import retrofit2.http.GET

@Keep
interface ApiService {
    @GET(ApiConstants.FRUITS)
    suspend fun getFruits(): List<Fruit>
}