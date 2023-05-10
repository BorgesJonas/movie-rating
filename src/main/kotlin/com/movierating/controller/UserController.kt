package com.movierating.controller

import com.movierating.model.UserModel
import com.movierating.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("user")
class UserController(
    private val userService: UserService
) {

    @GetMapping
    fun findAll(): List<UserModel> {
        return userService.findAll()
    }

    @PostMapping
    fun createUser(@RequestBody user: UserModel) {
        userService.createUser(user)
    }
}