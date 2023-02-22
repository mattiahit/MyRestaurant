package pl.mattiahit.domain.food

import pl.mattiahit.domain.common.CuisineType

data class FoodDto(
    val name: String,
    val description: String?,
    val image: String?,
    val cuisine: CuisineType
)

fun FoodEntity.toDto() = FoodDto(
    name = name,
    description = description,
    image = image,
    cuisine = cuisine
)