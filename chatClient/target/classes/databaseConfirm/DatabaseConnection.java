/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseConfirm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lhqua
 */
public class DatabaseConnection {
    private Connection connection;
    
    private static DatabaseConnection databaseConnection;
    
    private DatabaseConnection()throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/chatUser","root","123456");
    }
    public Connection getConnection(){
        return connection;
    }
    public static DatabaseConnection getDatabaseConnection()throws ClassNotFoundException,SQLException{
        if(databaseConnection == null){
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }
}
