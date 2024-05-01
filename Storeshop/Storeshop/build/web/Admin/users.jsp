<%-- 
    Document   : users
    Created on : Apr 20, 2024, 7:50:57 AM
    Author     : shali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add New Item</title>
    <link rel="stylesheet" href="admin.css">
</head>
<body>
    <div class="dashboard">
        <div class="sidebar">
            <div class="menu">
                <div class="menu-item">DASHBOARD</div>
                <div class="menu-item ">Add item</div>
                <div class="menu-item">users</div>
                <div class="menu-item">Categories</div>
                <div class="menu-item">Orders</div>
            </div>
        </div>
        <div class="content">
            <div class="header">
                <input type="search" placeholder="Search" class="search-input">
                <span class="admin">Administrator</span>
            </div>
            <table class="items-table">
                <thead>
                    <tr>
                        <th>Image</th>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Category</th>
                        <th>Action</th>
                    </tr>
                </thead>
                
            </table>
        </div>
    </div>
</body>
</html>
