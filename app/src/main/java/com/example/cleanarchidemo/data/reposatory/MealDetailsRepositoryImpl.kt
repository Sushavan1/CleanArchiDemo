package com.example.cleanarchidemo.data.reposatory

import com.example.cleanarchidemo.data.model.MealsDto
import com.example.cleanarchidemo.data.remote.MealSearchAPI
import com.example.cleanarchidemo.domain.reposatory.MealDetailsRepository
import retrofit2.Response

class MealDetailsRepositoryImpl(private val mealSearchAPI: MealSearchAPI): MealDetailsRepository {
    override suspend fun getMealDetails(id: String): Response<MealsDto> {
        return mealSearchAPI.getMealDetails(id)
    }
}