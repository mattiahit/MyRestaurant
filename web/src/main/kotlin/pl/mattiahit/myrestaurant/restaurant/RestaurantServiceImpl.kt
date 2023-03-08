package pl.mattiahit.myrestaurant.restaurant

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import pl.mattiahit.domain.restaurant.RestaurantDto
import pl.mattiahit.persistance.RestaurantRepository

@Service
class RestaurantServiceImpl(private val restaurantRepository: RestaurantRepository): RestaurantService {
    override fun getAllRestaurants(): MutableIterable<RestaurantDto> {
        return restaurantRepository.findAll()
    }

    override fun createRestaurant(restaurant: RestaurantDto) {
        restaurantRepository.save(restaurant)
    }

    override fun updateRestaurant(id: Int, restaurant: RestaurantDto) {
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

    override fun getRestaurantById(id: Int): RestaurantDto? {
        return restaurantRepository.findByIdOrNull(id)
    }
}