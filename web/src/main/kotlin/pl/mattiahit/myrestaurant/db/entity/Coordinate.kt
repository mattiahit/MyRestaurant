package pl.mattiahit.myrestaurant.db.entity

import jakarta.persistence.*

@Entity
@Table(name = "coordinates")
class Coordinate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Int? = null
    @Column(name = "lat", nullable = false)
    val lat: Double = 0.0
    @Column(name = "lon", nullable = false)
    val lon: Double = 0.0
    @OneToOne(mappedBy = "coordinates")
    val restaurant: Restaurant? = null
}