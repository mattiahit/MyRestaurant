package pl.mattiahit.domain.restaurant

import pl.mattiahit.domain.coordinate.CoordinateDto
import pl.mattiahit.domain.coordinate.toDto
import pl.mattiahit.domain.rate.RateDto
import pl.mattiahit.domain.rate.toDto

data class RestaurantDto(
    val name: String,
    val country: String,
    val city: String,
    val street: String,
    val buildingNumber: String,
    val coordinates: CoordinateDto,
    val rates: List<RateDto>,
)

fun RestaurantEntity.toDto() = RestaurantDto(
    name = name,
    country = country,
    city = city,
    street = street,
    buildingNumber = buildingNumber,
    coordinates = coordinates.toDto(),
    rates = rates.map { it.toDto() }
)
