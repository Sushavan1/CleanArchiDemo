package com.example.cleanarchidemo.hilt

import com.example.cleanarchidemo.common.Constants
import com.example.cleanarchidemo.data.remote.MealSearchAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object HiltModules {

    @Provides
    @Singleton
    fun provideMealSearchAPI():MealSearchAPI{
    return Retrofit.Builder().baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create()).build()
        .create(MealSearchAPI::class.java)
    }
}