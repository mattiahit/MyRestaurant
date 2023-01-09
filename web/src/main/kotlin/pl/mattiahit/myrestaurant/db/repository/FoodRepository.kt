package pl.mattiahit.myrestaurant.db.repository;

import org.springframework.data.repository.CrudRepository
import pl.mattiahit.myrestaurant.db.entity.Food

interface FoodRepository : CrudRepository<Food, Int> {
}