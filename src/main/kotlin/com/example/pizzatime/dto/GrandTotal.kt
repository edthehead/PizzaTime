package com.example.pizzatime

data class GrandTotal(
    val toppings: List<ToppingData>,
)

data class ToppingData(
    val topping: String,
    val orderCount: Int,
)