package com.example.cleanarchidemo.domain.reposatory

import com.example.cleanarchidemo.data.model.MealsDto
import retrofit2.Response

interface MealSearchRepository {
    suspend fun getMealSearch(s:String): Response<MealsDto>
}