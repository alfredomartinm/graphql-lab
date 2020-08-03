package io.alfredux.graphql.graphqllab.domain.entity

import javax.persistence.*

@Entity
data class Product(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @Column(nullable = false)
        val name: String)

@Entity
data class Inventory(
        @Id
        val productId: Int,

        @Column(nullable = false)
        val amount: Long)


data class Book(val id: String, val name: String, val description: String)