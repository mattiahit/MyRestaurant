package pl.mattiahit.myrestaurant.db.repository;

import org.springframework.data.repository.CrudRepository
import pl.mattiahit.myrestaurant.db.entity.FoodMenu

interface FoodMenuRepository : CrudRepository<FoodMenu, Int> {
}