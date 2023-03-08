package pl.mattiahit.domain.foodmenu

import pl.mattiahit.domain.food.FoodDto
import pl.mattiahit.domain.food.toDto

data class FoodMenuDto(
    val foodList: List<FoodDto>
)

fun FoodMenuEntity.toDto() = FoodMenuDto(
    foodList = foodList.map { it.toDto() }
)
