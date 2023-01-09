package pl.mattiahit.myrestaurant.restaurant

import pl.mattiahit.myrestaurant.db.entity.Restaurant

interface RestaurantService {
    fun getAllRestaurants(): MutableIterable<Restaurant>
    fun createRestaurant(restaurant: Restaurant)
    fun updateRestaurant(id: Int, restaurant: Restaurant)
    fun deleteRestaurant(id: Int)
    fun getRestaurantById(id: Int): Restaurant?
}