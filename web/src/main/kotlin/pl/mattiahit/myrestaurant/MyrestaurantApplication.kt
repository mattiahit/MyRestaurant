package pl.mattiahit.myrestaurant

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import pl.mattiahit.myrestaurant.db.repository.RestaurantRepository

@SpringBootApplication
class MyrestaurantApplication

@Autowired
lateinit var restaurantRepository: RestaurantRepository

fun main(args: Array<String>) {
	runApplication<MyrestaurantApplication>(*args)
}
