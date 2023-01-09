package pl.mattiahit.myrestaurant.restaurant

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController

@RestController
class RestaurantController {

    @Autowired
    private lateinit var restaurantService: RestaurantService
}