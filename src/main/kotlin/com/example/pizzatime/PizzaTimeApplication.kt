package com.example.pizzatime

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
class PizzaTimeApplication

fun main(args: Array<String>) {
	runApplication<PizzaTimeApplication>(*args)
}
