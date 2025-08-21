package com.app.nelsonapp.domain.repository

import android.content.Context
import com.app.nelsonapp.data.models.Fruit
import com.app.nelsonapp.data.sources.remote.ApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.*

@Singleton
class FruitRepository @Inject constructor(
    context: Context,
    private val apiService: ApiService,
) {
    fun getFruits(): Flow<List<Fruit>> = flow {
        val fruits = apiService.getFruits()
        emit(fruits)
    }
}