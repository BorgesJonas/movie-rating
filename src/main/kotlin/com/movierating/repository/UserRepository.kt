package com.movierating.repository

import com.movierating.model.UserModel
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<UserModel, Int> {
}