package pl.mattiahit.myrestaurant.restaurant

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import pl.mattiahit.myrestaurant.db.repository.RestaurantRepository

@Controller
class RestaurantController {

    @Autowired
    private lateinit var restaurantRepository: RestaurantRepository
}