package pl.mattiahit.myrestaurant.restaurant

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import pl.mattiahit.myrestaurant.db.entity.Restaurant
import pl.mattiahit.myrestaurant.db.repository.RestaurantRepository

@Service
class RestaurantServiceImpl(private val restaurantRepository: RestaurantRepository): RestaurantService {
    override fun getAllRestaurants(): MutableIterable<Restaurant> {
        return restaurantRepository.findAll()
    }

    override fun createRestaurant(restaurant: Restaurant) {
        restaurantRepository.save(restaurant)
    }

    override fun updateRestaurant(id: Int, restaurant: Restaurant) {
        val restaurant = restaurantRepository.findByIdOrNull(id)
        restaurant?.let {
            it.name = restaurant.name
            it.city = restaurant.city
            it.country = restaurant.country
            it.street = restaurant.street
            it.coordinates = restaurant.coordinates
            it.buildingNumber = restaurant.buildingNumber
            it.foodMenu = restaurant.foodMenu
            it.rates = restaurant.rates
            restaurantRepository.save(it)
        }
    }

    override fun deleteRestaurant(id: Int) {
        val restaurant = restaurantRepository.findByIdOrNull(id)
        restaurant?.let {
            restaurantRepository.delete(restaurant)
        }
    }

    override fun getRestaurantById(id: Int): Restaurant? {
        return restaurantRepository.findByIdOrNull(id)
    }
}