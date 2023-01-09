package pl.mattiahit.myrestaurant.db.repository;

import org.springframework.data.repository.CrudRepository
import pl.mattiahit.myrestaurant.db.entity.Rate

interface RateRepository : CrudRepository<Rate, Int> {
}