package pl.mattiahit.myrestaurant.db.entity

import jakarta.persistence.*

@Entity
@Table(name = "restaurants")
class Restaurant (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column(name = "name", nullable = false)
    var name: String,
    @Column(name = "country", nullable = false)
    var country: String,
    @Column(name = "city", nullable = false)
    var city: String,
    @Column(name = "street", nullable = false)
    var street: String,
    @Column(name = "building_number", nullable = false)
    var buildingNumber: String,
    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "coordinate_id", referencedColumnName = "id")
    var coordinates: Coordinate,
    @OneToMany(mappedBy = "restaurant", cascade = [CascadeType.ALL], orphanRemoval = true)
    var rates: MutableList<Rate>,
    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "foodmenu_id", referencedColumnName = "id")
    var foodMenu: FoodMenu
)