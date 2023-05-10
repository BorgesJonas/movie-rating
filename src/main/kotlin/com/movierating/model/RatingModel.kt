package com.movierating.model

import jakarta.persistence.*
import java.math.BigDecimal

@Entity(name = "rating")
data class RatingModel (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne
    @JoinColumn(name = "user_id")
    val user: UserModel,

    @ManyToOne
    @JoinColumn(name = "movie_id")
    val movie: MovieModel,

    @Column
    val rating: Float
)