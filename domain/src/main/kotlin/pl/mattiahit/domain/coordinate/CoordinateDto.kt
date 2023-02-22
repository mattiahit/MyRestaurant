package pl.mattiahit.domain.coordinate

data class CoordinateDto(
    val lat: Double,
    val lon: Double
)

fun CoordinateEntity.toDto() = CoordinateDto(
    lat = lat,
    lon = lon
)
