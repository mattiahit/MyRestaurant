package pl.mattiahit.domain.rate

import java.util.*

data class RateDto(
    val authorId: Int,
    val date: Date,
    val rateValue: Int,
    val comment: String?
    )


fun RateEntity.toDto() = RateDto(
    authorId = authorId,
    date = date,
    rateValue = rateValue,
    comment = comment
)
