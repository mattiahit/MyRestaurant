package pl.mattiahit.myrestaurant.db.entity

import jakarta.persistence.*
import java.sql.Date

@Entity
class Rate(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column(nullable = false)
    val authorId: Int,
    @Column(nullable = false)
    val date: Date,
    @Column(nullable = false)
    val rateValue: Int,
    @Column(nullable = true)
    var comment: String?,
    @ManyToOne(fetch = FetchType.LAZY)
    val restaurantId: Int
)
