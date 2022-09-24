/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.adrian.proj.main;

import me.adrian.proj.controller.Controller;
import me.adrian.proj.dao.ProductDao;
import me.adrian.proj.dao.ProductDaoImpl;
import me.adrian.proj.service.ProductService;
import me.adrian.proj.singleton.Hibernate;
import me.adrian.proj.view.View;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author adrianfaisal
 */
public class Main {
    private static ApplicationContext applicationContext;
    
    public static void main(String[] args) {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        
        ProductService productService = (ProductService)applicationContext.getBean("ProductService");
        Controller controller = new Controller(productService);
        new View(controller).setVisible(true);
        
    }
}
