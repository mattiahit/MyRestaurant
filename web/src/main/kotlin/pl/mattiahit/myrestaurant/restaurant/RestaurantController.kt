package pl.mattiahit.myrestaurant.restaurant

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("restaurant")
class RestaurantController {

    @Autowired
    private lateinit var restaurantService: RestaurantService

    @GetMapping("/get-all", produces = ["application/json;charset=UTF-8"])
    fun getAllRestaurants(): List<RestaurantDto> {
        return restaurantService.getAllRestaurants().map { it.toDTO() }
    }

    @PostMapping("/save/{restaurant}")
    fun saveNewRestaurant(@PathVariable restaurant: RestaurantDto) {
        restaurantService.createRestaurant(restaurant.toEntity())
    }

    @PutMapping("/update/{id}/{restaurant}")
    fun updateRestaurant(@PathVariable id: Int, @PathVariable restaurant: RestaurantDto) {
        restaurantService.updateRestaurant(id, restaurant.toEntity())
    }

    @DeleteMapping("/delete/{id}")
    fun deleteRestaurant(@PathVariable id: Int) {
        restaurantService.deleteRestaurant(id)
    }

    @GetMapping("/get-one/{id}")
    fun getSingleRestaurantWithId(@PathVariable id: Int): RestaurantDto? {
        val restaurant = restaurantService.getRestaurantById(id)
        restaurant?.let {
            return it.toDTO()
        }
        return null
    }
}