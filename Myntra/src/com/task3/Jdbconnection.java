package com.task3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbconnection {
    public static Connection establishDatabaseConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/myntra", "root", "root");
    }
}