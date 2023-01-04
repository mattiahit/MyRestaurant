package pl.mattiahit.myrestaurant.db.entity

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
class Restaurant (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column(nullable = false)
    val name: String,
    @Column(nullable = false)
    val country: String,
    @Column(nullable = false)
    val city: String,
    @Column(nullable = false)
    val street: String,
    @Column(nullable = false)
    val buildingNumber: String,
    @Column(nullable = false)
    val coordinates: List<Double>,
    @OneToMany(mappedBy = "restaurantId", cascade = [CascadeType.ALL], orphanRemoval = true)
    val rates: MutableList<Rate>
)