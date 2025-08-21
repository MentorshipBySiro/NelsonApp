package com.app.nelsonapp.data.models

data class Fruit(
    val family: String,
    val genus: String,
    val id: Int,
    val name: String,
    val nutritions: Nutrition,
    val order: String
)

data class Nutrition(
    val calories: Int,
    val carbohydrates: Double,
    val fat: Double,
    val protein: Double,
    val sugar: Double
)