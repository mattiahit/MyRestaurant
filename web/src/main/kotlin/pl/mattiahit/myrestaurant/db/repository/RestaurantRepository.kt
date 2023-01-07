package pl.mattiahit.myrestaurant.db.repository;

import org.springframework.data.repository.CrudRepository
import pl.mattiahit.myrestaurant.db.entity.Restaurant

interface RestaurantRepository : CrudRepository<Restaurant, Int> {
}