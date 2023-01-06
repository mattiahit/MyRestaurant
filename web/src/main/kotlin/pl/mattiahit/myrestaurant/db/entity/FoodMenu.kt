package pl.mattiahit.myrestaurant.db.entity

import jakarta.persistence.*

@Entity
@Table(name = "food_menu")
class FoodMenu (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Int? = null,
    @OneToMany(mappedBy = "foodMenu", cascade = [CascadeType.ALL], orphanRemoval = true)
    val foodList: MutableList<Food>,
    @OneToOne(mappedBy = "foodMenu")
    val restaurant: Restaurant? = null
)