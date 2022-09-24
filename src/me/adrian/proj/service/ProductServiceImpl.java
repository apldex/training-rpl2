/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.adrian.proj.service;

import me.adrian.proj.dao.ProductDao;
import me.adrian.proj.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author adrianfaisal
 */
@Service("ProductService")
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductDao productDao;

    @Override
    @Transactional
    public Boolean create(Product product) {
        return this.productDao.create(product);
    }
    
}


// model -> controller -> view
// model -> DAO -> controller -> view
// model -> DAO -> service -> controller -> view