package pl.mattiahit.myrestaurant.db.entity

import jakarta.persistence.*
import pl.mattiahit.myrestaurant.common.enum.CuisineType

@Entity
@Table(name = "food")
class Food (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column(name = "name", nullable = false)
    val name: String,
    @Column(name = "description", nullable = true)
    val description: String?,
    @Column(name = "image", nullable = true)
    val image: String?,
    @Column(name = "cuisine", nullable = false)
    val cuisine: CuisineType,
    @ManyToOne
    @JoinColumn(name = "foodmenu_id", nullable = false)
    val foodMenu: FoodMenu
)