package com.example.pizzatime.repository

import com.example.pizzatime.model.PizzaModel
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Repository
interface ToppingsRepository: R2dbcRepository<PizzaModel, Long>{

    fun deleteAllByEmail(email: String)

    @Query("select count(p.topping), p.topping from pizza p group by p.topping")
    fun findGrandTotal(): Mono<Map<Long, String>>

}