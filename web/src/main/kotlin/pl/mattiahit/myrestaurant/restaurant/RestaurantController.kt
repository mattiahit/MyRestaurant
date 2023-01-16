package pl.mattiahit.myrestaurant.restaurant

import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pl.mattiahit.myrestaurant.db.entity.Restaurant

@RestController
@RequestMapping("restaurant")
class RestaurantController {

    @Autowired
    private lateinit var restaurantService: RestaurantService

    private lateinit var modelMapper: ModelMapper

    @GetMapping("/get-all", produces = ["application/json;charset=UTF-8"])
    fun getAllRestaurants(): List<RestaurantDto> {
        return restaurantService.getAllRestaurants().map { it.toDTO() }
    }

    @GetMapping("/save/{restaurant}")
    fun saveNewRestaurant(@PathVariable restaurant: RestaurantDto) {
        restaurantService.createRestaurant(modelMapper.map(restaurant, Restaurant::class.java))
    }
}