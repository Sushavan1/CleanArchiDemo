package com.example.cleanarchidemo.domain.reposatory

import com.example.cleanarchidemo.data.model.MealsDto
import retrofit2.Response

interface MealDetailsRepository {
    suspend fun getMealDetails(id:String): Response<MealsDto>
}