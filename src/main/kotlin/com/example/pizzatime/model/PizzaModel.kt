package com.example.pizzatime.model

import jakarta.persistence.*

@Entity(name = "pizza")
@Table(name = "pizza")
data class PizzaModel(
    @Column(name = "email", nullable = false)
    val email: String,

    @Column(name = "topping", nullable = false)
    val topping: String,
)
