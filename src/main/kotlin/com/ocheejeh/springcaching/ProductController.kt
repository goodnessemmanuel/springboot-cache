package com.ocheejeh.springcaching

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("products")
class ProductController(val productService: ProductService){

    @GetMapping
    fun getAllProducts() : List<Product>{
        return productService.getAllProducts()
    }

    @PostMapping
    fun addProduct(@RequestBody product: Product){
        productService.addProduct(product)
    }

}