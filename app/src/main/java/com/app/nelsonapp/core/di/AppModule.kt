package com.app.nelsonapp.core.di

import android.content.Context
import com.app.nelsonapp.data.sources.remote.ApiService
import com.app.nelsonapp.domain.repository.FruitRepository
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module(includes = [NetworkModule::class])
class AppModule {
    fun provideFruitRepository(
        @ApplicationContext context: Context,
        apiService: ApiService,
    ) : FruitRepository = FruitRepository(context, apiService)
}