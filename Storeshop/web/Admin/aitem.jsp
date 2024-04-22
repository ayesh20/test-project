<%-- 
    Document   : aitem
    Created on : Apr 22, 2024, 6:59:53 AM
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
            <div class="add-item-panel">
                <h1>Add a New Item</h1>
                <div class="form-group">
                    <input type="text" id="name" placeholder="Name">
                    <input type="text" id="price" placeholder="Price">
                    <input type="number" id="quantity" placeholder="Quantity">
                    <input type="text" id="category" placeholder="Category">
                    <div class="file-upload">
                        <input type="file" id="image">
                        <span class="file-label">Choose file</span>
                    </div>
                    <button type="submit">Add item</button>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
