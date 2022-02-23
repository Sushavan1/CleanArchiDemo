package com.example.cleanarchidemo.data.remote

import com.example.cleanarchidemo.data.model.MealsDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MealSearchAPI {
    @GET("api/json/v1/1/search.php")
    suspend fun getSearchMealList(
        @Query("s") query: String
    ): Response<MealsDto>


    @GET("api/json/v1/1/lookup.php")
    suspend fun getMealDetails(
        @Query("i") i: String
    ): Response<MealsDto>
}