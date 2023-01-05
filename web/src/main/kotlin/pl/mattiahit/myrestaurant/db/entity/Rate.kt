package pl.mattiahit.myrestaurant.db.entity

import jakarta.persistence.*
import java.sql.Date

@Entity
@Table(name = "rates")
class Rate(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column(name = "author_id", nullable = false)
    val authorId: Int,
    @Column(name = "date", nullable = false)
    val date: Date,
    @Column(name = "rate_value", nullable = false)
    val rateValue: Int,
    @Column(name = "comment", nullable = true)
    var comment: String?,
    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    val restaurant: Restaurant
)
