package com.movierating.model

import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDateTime

@Entity(name = "movie")
data class MovieModel (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column
    val image: String,

    @Column
    val title: String,

    @Column
    val synopsis: String,

    @Column
    val releaseYear: LocalDateTime,

    @ManyToOne
    @JoinColumn(name = "gender_id")
    val gender: GenderModel,

    @Column
    val totalRate: BigDecimal
)