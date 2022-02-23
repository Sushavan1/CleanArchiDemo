package com.example.cleanarchidemo.data.reposatory

import com.example.cleanarchidemo.data.model.MealsDto
import com.example.cleanarchidemo.data.remote.MealSearchAPI
import com.example.cleanarchidemo.domain.reposatory.MealSearchRepository
import retrofit2.Response

class MealSearchRepositoryImpl(private val mealSearchAPI: MealSearchAPI) : MealSearchRepository {
    override suspend fun getMealSearch(s: String): Response<MealsDto> {
        return mealSearchAPI.getSearchMealList(s)
    }
}