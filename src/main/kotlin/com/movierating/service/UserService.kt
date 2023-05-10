package com.movierating.service

import com.movierating.model.UserModel
import com.movierating.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun findAll(): List<UserModel> {
        return userRepository.findAll().toList()
    }

    fun createUser(user: UserModel) {
        userRepository.save(user)
    }
}