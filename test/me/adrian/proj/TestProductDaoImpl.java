/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.adrian.proj;

import static junit.framework.Assert.assertTrue;
import me.adrian.proj.dao.ProductDao;
import me.adrian.proj.model.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author adrianfaisal
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class TestProductDaoImpl {
    Product product = new Product();
    
    @Autowired
    ProductDao productDao;
    
    @Test
    public void testCreate() {
        product.setSku("10928674");
        product.setName("Ini Test");
        product.setPrice(10000);
        
        Boolean result = productDao.create(product);
        
        assertTrue(result.equals(true));
    }
}
