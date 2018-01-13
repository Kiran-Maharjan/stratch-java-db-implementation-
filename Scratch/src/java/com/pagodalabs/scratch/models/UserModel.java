/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pagodalabs.scratch.models;

//import DBConnection;
import com.pagodalabs.scratch.db.DBConnection;
import com.pagodalabs.scratch.entities.User;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author kiran
 */
public class UserModel {

    public static int insert(User user) throws ClassNotFoundException, SQLException {
        DBConnection connection = new DBConnection();
        connection.open();
        String sql = "INSERT INTO users(username,password,email,added_date,status) VALUES(?,?,?,?,?)";
        PreparedStatement statement = connection.initStatement(sql);
        statement.setString(1, user.getUsername());
        statement.setString(2, user.getPassword());
        statement.setString(3, user.getEmail());
        statement.setDate(4, user.getAddedDate());
        statement.setBoolean(5, user.getStatus());

        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }

}
