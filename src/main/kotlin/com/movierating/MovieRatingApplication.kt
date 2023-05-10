package com.movierating

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MovieRatingApplication

fun main(args: Array<String>) {
	runApplication<MovieRatingApplication>(*args)
}
