/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.adrian.proj.dao;

import me.adrian.proj.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author adrianfaisal
 */
@Repository("ProductDao")
public class ProductDaoImpl implements ProductDao {
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Boolean create(Product product) {
        Session session = sessionFactory.openSession();
        
        try {
            session.beginTransaction(); // buka sesi transaction ke database
            session.save(product); // proses insert data
            session.getTransaction().commit(); // info ke db kalau sudah selesai insert
        } catch(Exception e) {
            session.getTransaction().rollback(); // untuk undo perubahan data
        } finally {
            session.close(); // tutup session
        }
        
        return true;
    }
    
}
