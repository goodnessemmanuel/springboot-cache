package com.ocheejeh.springcaching

import org.springframework.stereotype.Service

@Service
class ProductService (val productRepository: ProductRepository) {


    fun getAllProducts(): List<Product> =
        productRepository.findAll()

    fun addProduct(product: Product) {
        productRepository.save(product)
    }
}