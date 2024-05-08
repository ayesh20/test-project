<%@page import="java.util.List"%>
<%@page import="store.dao.OrderDao"%>
<%@page import="store.connection.DbConnection"%>
<%@page import="store.model.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Orders</title>
    <link rel="stylesheet" href="admin.css">
    <style>
     
    </style>
</head>
<body>
    <div class="dashboard">
        <div class="sidebar">
            <div class="menu">
                <div class="menu-item"><a href="dashboad.jsp">DASHBOARD</a></div>
                <div class="menu-item "><a href="../aitem.jsp">Add item</a></div>
                <div class="menu-item"><a href="users.jsp">Users</a></div>
                <div class="menu-item"><a href="../category.jsp">Categories</a></div>
                <div class="menu-item"><a href="orders.jsp">Orders</a></div>
            </div>
        </div>
        <div class="content">
            <div class="header">
                <input type="search" placeholder="Search" class="search-input">
                <span class="admin">Administrator</span>
            </div>
            <h3>Orders</h3>
            <table>
                <thead>
                    <tr>
                        <th>Order ID</th> 
                        <th>Name</th> 
                        <th>Address</th>
                        <th>Contact Number</th>
                        <th>Total Price</th>
                        <th>Payment Method</th>
                        <th>Items</th>
                    </tr>
                </thead>
                <tbody>
                    <%@page import="store.dao.OrderDao"%>
                    <%@page import="store.connection.DbConnection"%>
                    <%@page import="store.model.Order"%>
                    <% 
                        OrderDao orderDao = null;
                        try {
                            orderDao = new OrderDao(DbConnection.getConnection());
                            List<Order> orderList = orderDao.getAllOrders();
                            for (Order order : orderList) {
                    %>
                    <tr>
                        <td class="td1"><%= order.getOrderId() %></td>
                        <td class="td1"><%= order.getName() %></td>
                        <td class="td1"><%= order.getAddress() %></td>
                        <td class="td1"><%= order.getContactNumber() %></td>
                        <td class="td1"><%= order.getTotalPrice() %></td>
                        <td class="td1"><%= order.getPaymentMethod() %></td>
                        <td class="td1"><%= order.getItems() %></td>
                    </tr>
                    <% 
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            if (orderDao != null) {
                                orderDao.closeResources(); // close resources
                            }
                        }
                    %>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
