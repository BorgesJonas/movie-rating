package com.movierating.model

import jakarta.persistence.*

@Entity(name = "gender")
data class GenderModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column
    val name: String,
)