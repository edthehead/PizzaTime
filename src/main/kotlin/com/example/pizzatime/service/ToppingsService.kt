package com.example.pizzatime.service

import com.example.pizzatime.model.PizzaModel
import com.example.pizzatime.repository.ToppingsRepository
import mu.KotlinLogging
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

private val logger = KotlinLogging.logger { }

@Service
class ToppingsService(private val repo: ToppingsRepository) {

    fun submitOrder(email: String, toppings: List<String>) {
        logger.info { "Remove toppings with email: $email is such exist" }
        repo.deleteAllByEmail(email)
        logger.info { "Add new toppings" }
        repo.saveAll(Flux.fromStream(toppings.stream().map { PizzaModel(email, it) }))
    }

    fun getGrandTotal() = repo.findGrandTotal()

}