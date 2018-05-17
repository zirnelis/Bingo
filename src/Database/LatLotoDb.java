/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elina
 */
public class LatLotoDb {
    
    Connection conn;

    public LatLotoDb() {
        String dbaseDriver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/bingo";
        String user = "root";
        String pass = "123";
        
        System.out.println("Connecting to database...");
        
        try {
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            System.out.println("Can`t connect to database..");
        }
    
    }
    
    public void disconnect() {
        if (conn != null) {
            try {
                conn.close();
                conn = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
}
