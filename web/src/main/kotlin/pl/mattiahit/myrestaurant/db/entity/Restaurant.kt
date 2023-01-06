package pl.mattiahit.myrestaurant.db.entity

import jakarta.persistence.*

@Entity
@Table(name = "restaurants")
class Restaurant (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column(name = "name", nullable = false)
    val name: String,
    @Column(name = "country", nullable = false)
    val country: String,
    @Column(name = "city", nullable = false)
    val city: String,
    @Column(name = "street", nullable = false)
    val street: String,
    @Column(name = "building_number", nullable = false)
    val buildingNumber: String,
    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "coordinate_id", referencedColumnName = "id")
    val coordinates: Coordinate,
    @OneToMany(mappedBy = "restaurant", cascade = [CascadeType.ALL], orphanRemoval = true)
    val rates: MutableList<Rate>,
    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "foodmenu_id", referencedColumnName = "id")
    val foodMenu: FoodMenu
)