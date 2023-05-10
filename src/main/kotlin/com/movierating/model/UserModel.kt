package com.movierating.model

import jakarta.persistence.*

@Entity(name = "user")
data class UserModel (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column
    var userName: String,

    @Column
    var email: String,
)