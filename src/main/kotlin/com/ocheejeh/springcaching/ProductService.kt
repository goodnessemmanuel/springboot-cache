package com.ocheejeh.springcaching

import org.springframework.cache.annotation.CacheEvict
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class ProductService (val productRepository: ProductRepository) {


    @Cacheable("products")
    fun getAllProducts(): List<Product> {
        sleep(1000)
        println("Calling repository to get all products...")
       return  productRepository.findAll()
    }

    @CacheEvict("products")
    fun addProduct(product: Product) {
        productRepository.save(product)
    }

    fun sleep(time: Long){
        Thread.sleep(
            time
        )
    }
}