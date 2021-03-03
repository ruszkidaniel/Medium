/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.blckdg.medium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Blackdog
 */
public class DatabaseConnection {

    Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); 

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/okj", "root", "");
            return c;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
