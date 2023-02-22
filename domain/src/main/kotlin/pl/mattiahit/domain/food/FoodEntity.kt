package pl.mattiahit.domain.food

import jakarta.persistence.*
import pl.mattiahit.domain.common.CuisineType
import pl.mattiahit.domain.foodmenu.FoodMenuEntity

@Entity
@Table(name = "food")
class FoodEntity (
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
    val foodMenu: FoodMenuEntity
)