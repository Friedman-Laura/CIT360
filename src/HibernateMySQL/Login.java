/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HibernateMySQL;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Laura
 */
public class Login {
    public static void main(String[] args) {
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "CIT360Spring2o!8");
            if(conn != null) {
                System.out.println("Connected to Login Database successfully");
            }
        } catch (Exception e) {
            System.out.println("Did not connect to Login database");
        }
    }
    
}
