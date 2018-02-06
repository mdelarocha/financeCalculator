/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure; 
import java.sql.*; 
import javax.swing.*;

/**
 *
 * @author Miguel
 */
public class MySqlConnect {
    Connection conn = null;
    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://cs4347-project.cujq9m2vjohw.us-east-1.rds.amazonaws.com:3306", "mdelarocha", "CrOliNAr");
            // JOptionPane.showMessageDialog(null, "Connected to database");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
