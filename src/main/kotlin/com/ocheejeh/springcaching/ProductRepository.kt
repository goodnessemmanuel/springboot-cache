package com.ocheejeh.springcaching

import org.springframework.stereotype.Repository


@Repository
class ProductRepository {

    val products = mutableListOf(
        Product(1, "Product 1"),
        Product(2, "Product 2"),
        Product(3, "Product 3"),
        Product(4, "Product 4"),
    )

    fun findAll(): List<Product>{
        sleep(1000)
        return products
    }

    fun sleep(time: Long){
        Thread.sleep(
            time
        )
    }

    fun save(product: Product) {
        products.add(product)
    }
}