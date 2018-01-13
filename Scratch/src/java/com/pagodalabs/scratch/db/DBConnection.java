package com.pagodalabs.scratch.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiran
 */
public class DBConnection {

    Connection connection=null;
    PreparedStatement statement=null;

    public DBConnection() {
    }
    
    
    public void open() throws ClassNotFoundException, SQLException{
        //make driver
        Class.forName("com.mysql.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost:8080/jsp","root","");
        
    }
    //initializing and returning rather than execute
    public PreparedStatement initStatement(String sql) throws SQLException{
        statement=connection.prepareStatement(sql);
        return statement;
    }
    
    public int executeUpdate() throws SQLException{
        return executeUpdate();
    }
    public void close() throws SQLException{
        if(!connection.isClosed()){
            connection.close();
            connection=null;
        }
    }
}
