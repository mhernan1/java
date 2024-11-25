package com.empresa.modulo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexiondb {

    private static final String URL = "jdbc:mysql://localhost:3306/ecommerce_deporte"; 
    private static final String USUARIO = "root"; 
    private static final String PASSWORD = "2357"; 


    public static Connection conectar() throws SQLException {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver de MySQL: " + e.getMessage());
        }
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }
}
