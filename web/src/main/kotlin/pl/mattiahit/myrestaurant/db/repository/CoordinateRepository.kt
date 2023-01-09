package pl.mattiahit.myrestaurant.db.repository;

import org.springframework.data.repository.CrudRepository
import pl.mattiahit.myrestaurant.db.entity.Coordinate

interface CoordinateRepository : CrudRepository<Coordinate, Int> {
}