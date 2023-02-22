package pl.mattiahit.domain.foodmenu

import pl.mattiahit.domain.food.FoodEntity
import pl.mattiahit.domain.restaurant.RestaurantDto
import pl.mattiahit.domain.restaurant.toDto

data class FoodMenuDto(
    val foodList: List<FoodEntity>,
    val restaurant: RestaurantDto?
)

fun FoodMenuEntity.toDto() = FoodMenuDto(
    foodList = foodList,
    restaurant = restaurant?.toDto()
)
