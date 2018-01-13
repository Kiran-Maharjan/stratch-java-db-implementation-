<%-- 
    Document   : test
    Created on : Dec 31, 2017, 11:33:05 AM
    Author     : kiran
--%>

<%@page import="java.sql.Date"%>
<%@page import="com.pagodalabs.scratch.entities.User, com.pagodalabs.scratch.models.UserModel" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Date" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Insert Test</h1>
        <% //default value for login is nul,
            User u=new User();
            u.setUsername("Kiran");
            u.setPassword("dixanta");
            u.setEmail("kiranmaharjan8888@gmail.com");
            Date d=new Date(System.currentTimeMillis());
            u.setAddedDate(d);
            UserModel.insert(u);
            %>
    </body>
</html>
