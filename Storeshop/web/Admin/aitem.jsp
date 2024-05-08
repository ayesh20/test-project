<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User List</title>
    <link rel="stylesheet" href="admin.css">
    <style>
        
    </style>
</head>
<body>
    <div class="dashboard">
        <div class="sidebar">
           <div class="menu">
        <div class="menu-item"><a href="dashboad.jsp">DASHBOARD</a></div>
        <div class="menu-item "><a href="aitem.jsp">Add item</a></div>
        <div class="menu-item"><a href="users.jsp">Users</a></div>
        <div class="menu-item"><a href="category.jsp">Categories</a></div>
        <div class="menu-item"><a href="orders.jsp">Orders</a></div>
    </div>
        </div>
        <div class="content">
            <div class="header">
                <input type="search" placeholder="Search" class="search-input">
                <span class="admin">Administrator</span>
            </div>
            <h3>Users</h3>
            <table>
                <thead>
                    <tr>
                        <th style="width: 30%;" >Username</th> 
                        <th style="width: 30%;" >Email</th> 
                        <th style="width: 20%;">Password</th>
                    </tr>
                </thead>
                <tbody>
                    <%@page import="store.dao.UserDao"%>
                    <%@page import="store.connection.DbConnection"%>
                    <%@page import="store.model.User"%>
                    <% 
                        UserDao userDao = null;
                        try {
                            userDao = new UserDao(DbConnection.getConnection());
                            List<User> userList = userDao.getAllUsers();
                            for (User user : userList) {
                    %>
                    <tr>
                        <td class="td1"><%= user.getName() %></td>
                        <td class="td1"><%= user.getEmail() %></td>
                        <td class="td1"><%= user.getPassword() %></td>
                    </tr>
                    <% 
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            if (userDao != null) {
                                userDao.closeResources(); // close resources
                            }
                        }
                    %>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
