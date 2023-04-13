package com.example.pizzatime.controller

import com.example.pizzatime.dto.PizzaToppings
import com.example.pizzatime.service.ToppingsService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/pizza-time")
class ToppingsController(private val service: ToppingsService) {

    @PostMapping("/submit")
    fun submit(@RequestBody payload: PizzaToppings) {
        service.submitOrder(payload.email, payload.toppings)
    }

    @GetMapping("/aggregated")
    fun getData() = service.getGrandTotal()

}