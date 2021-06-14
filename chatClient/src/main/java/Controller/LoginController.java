/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.DriverManager;
/**
 *
 * @author lhqua
 */
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
public class LoginController {
    public static boolean Login(String userName, String passWord) throws SQLException, ClassNotFoundException{
        boolean resuilt = false;
        String SQL = "SELECT username,userpassword FROM chatUser";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/chatUser","root","123456");
        
        PreparedStatement preparedStatement = connection.prepareStatement(SQL);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            if(resultSet.getString(1).equals(userName) && resultSet.getString(2).equals(passWord)){
                resuilt = true;
            }
        }
        connection.close();
        resultSet.close();
        preparedStatement.close();
        return resuilt;
    }
    
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        String SQL = "SELECT * FROM chatUser";
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection con = DriverManager
//                .getConnection("jdbc:mysql://localhost:3306/chatUser","root","123456");
//        
////        PreparedStatement preparedStatement = connection.prepareStatement(SQL);
//////        preparedStatement.setObject(1, userName);
//////        preparedStatement.setObject(2, passWord);
////        ResultSet resultSet = preparedStatement.executeQuery();
////        if (resultSet.next()) {
////            System.out.println("Id: " + resultSet.getInt(1));
////            System.out.println("First: " + resultSet.getInt(2));
////        }
////        connection.close();
////        resultSet.close();
////        preparedStatement.close();
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery(SQL);
//        ResultSetMetaData rsmd = rs.getMetaData();
//        System.out.println("Total columns: " + rsmd.getColumnCount());
//        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
//      System.out.println(
//          "Column " + i + " [name: " + rsmd.getColumnName(i) + " - type: " + rsmd.getColumnTypeName(i) + "]");
//    }
//    System.out.println("--------------------");
//    while (rs.next())
//      System.out.println(rs.getString(1) + "  " + rs.getString(2) );
//    con.close();
//  
//    }
}
