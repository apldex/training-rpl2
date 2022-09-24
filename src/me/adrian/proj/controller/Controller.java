/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.adrian.proj.controller;

import me.adrian.proj.model.Product;
import me.adrian.proj.service.ProductService;

/**
 *
 * @author adrian
 */
public class Controller {

    private ProductService productService;

    public Controller(ProductService productService) {
        this.productService = productService;
    }

    public Boolean createProduct(Product product) {
        return this.productService.create(product);
    }
}
