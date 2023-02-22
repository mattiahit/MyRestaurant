package pl.mattiahit.domain.coordinate

import jakarta.persistence.*
import pl.mattiahit.domain.restaurant.RestaurantEntity

@Entity
@Table(name = "coordinate")
class CoordinateEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Int?,
    @Column(name = "lat", nullable = false)
    val lat: Double,
    @Column(name = "lon", nullable = false)
    val lon: Double,
    @OneToOne(mappedBy = "coordinates")
    val restaurant: RestaurantEntity? = null
)