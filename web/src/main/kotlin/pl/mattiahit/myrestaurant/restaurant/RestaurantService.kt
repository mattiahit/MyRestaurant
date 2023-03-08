package pl.mattiahit.myrestaurant.restaurant

import pl.mattiahit.domain.restaurant.RestaurantDto


interface RestaurantService {
    fun getAllRestaurants(): MutableIterable<RestaurantDto>
    fun createRestaurant(restaurant: RestaurantDto)
    fun updateRestaurant(id: Int, restaurant: RestaurantDto)
    fun deleteRestaurant(id: Int)
    fun getRestaurantById(id: Int): RestaurantDto?
}