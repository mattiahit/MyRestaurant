package pl.mattiahit.myrestaurant.restaurant

import pl.mattiahit.myrestaurant.db.entity.Coordinate
import pl.mattiahit.myrestaurant.db.entity.FoodMenu
import pl.mattiahit.myrestaurant.db.entity.Rate
import pl.mattiahit.myrestaurant.db.entity.Restaurant

data class RestaurantDto(
    val id: Int?,
    val name: String,
    val country: String,
    val city: String,
    val street: String,
    val buildingNumber: String,
    val coordinates: Coordinate,
    val rates: MutableList<Rate>,
    val foodMenu: FoodMenu
)

fun Restaurant.toDTO() = RestaurantDto(
    id = id,
    name = name,
    country = country,
    city = city,
    street = street,
    buildingNumber = buildingNumber,
    coordinates = coordinates,
    rates = rates,
    foodMenu = foodMenu
)