package pl.mattiahit.domain.foodmenu

import jakarta.persistence.*
import pl.mattiahit.domain.food.FoodEntity
import pl.mattiahit.domain.restaurant.RestaurantEntity

@Entity
@Table(name = "food_menu")
class FoodMenuEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Int? = null,
    @OneToMany(mappedBy = "foodMenu", cascade = [CascadeType.ALL], orphanRemoval = true)
    val foodList: List<FoodEntity>,
    @OneToOne(mappedBy = "foodMenu")
    val restaurant: RestaurantEntity? = null
)