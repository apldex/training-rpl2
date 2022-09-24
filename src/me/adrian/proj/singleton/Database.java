/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.adrian.proj.singleton;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author adrianfaisal
 */
public class Database {
    static Connection c;
    
    public static Connection getConnection() {
        if(c != null) {
            return c;
        }
        
        MysqlDataSource ds = new MysqlDataSource();
        ds.setDatabaseName("retail");
        ds.setUser("root");
        ds.setPassword("labti");
        
        try {
            c = ds.getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return c;
    }
}
