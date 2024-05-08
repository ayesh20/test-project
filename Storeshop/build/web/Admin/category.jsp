<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="store.dao.ProductsDao"%>
<%@page import="store.model.Product"%>
<%@page import="store.connection.DbConnection"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Category</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="shortcut icon" href="images/fav.png">
    <link rel = "stylesheet" type = "text/css" href = "css/bootstrap.css " />
    <link rel="stylesheet" href="./Admin/admin.css">

</head>
<body>
    <div class="dashboard">
        <div class="sidebar">
            <div class="menu">
                <div class="menu-item"><a href="Admin/dashboad.jsp">DASHBOARD</a></div>
                <div class="menu-item "><a href="Admin/aitem.jsp">Add item</a></div>
                <div class="menu-item"><a href="Admin/users.jsp">Users</a></div>
                <div class="menu-item"><a href="Admin/categories.jsp">Categories</a></div>
                <div class="menu-item"><a href="Admin/orders.jsp">Orders</a></div>
            </div>
        </div>

        <%
            // Create a new instance of ProductsDao
            ProductsDao pd = new ProductsDao(DbConnection.getConnection());

            // Retrieve the products from the database
            List<Product> shirts = pd.getProductsByCategory("Shirts");
            List<Product> tshirts = pd.getProductsByCategory("Tshirts");
            List<Product> trousers = pd.getProductsByCategory("Trousers");
            List<Product> shorts = pd.getProductsByCategory("Shorts");
        %>
        <div class="container">
            <!-- Section for Shirts -->
            <h1>Shirts</h1>
            <section id="shirts" class="category-section">
               
                <table class="products-table">
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Price</th>
                            <th>Image</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Product product : shirts) {%>
                        <tr>
                            <td><%= product.getName()%></td>
                            <td>Rs.<%= product.getPrice()%></td>
                            <td><img src="<%= product.getImage()%>" alt="<%= product.getName()%>"></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
            </section>
                    <hr>
                    <hr>
            <!-- Section for T-Shirts -->
            <h1>T-Shirts</h1>
            <section id="tshirts" class="category-section">
               
                <table class="products-table">
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Price</th>
                            <th>Image</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Product product : tshirts) {%>
                        <tr>
                            <td><%= product.getName()%></td>
                            <td>Rs.<%= product.getPrice()%></td>
                            <td><img src="<%= product.getImage()%>" alt="<%= product.getName()%>"></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
            </section>
<hr>
                    <hr>
            <!-- Section for Trousers -->
            <h1>Trousers</h1>
            <section id="trousers" class="category-section">
               
                <table class="products-table">
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Price</th>
                            <th>Image</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Product product : trousers) {%>
                        <tr>
                            <td><%= product.getName()%></td>
                            <td>Rs.<%= product.getPrice()%></td>
                            <td><img src="<%= product.getImage()%>" alt="<%= product.getName()%>"></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
            </section>
<hr>
                    <hr>
            <!-- Section for Shorts -->
            <h1>Shorts</h1>
            <section id="shorts" class="category-section">
               
                <table class="products-table">
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Price</th>
                            <th>Image</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Product product : shorts) {%>
                        <tr>
                            <td><%= product.getName()%></td>
                            <td>Rs.<%= product.getPrice()%></td>
                            <td><img src="<%= product.getImage()%>" alt="<%= product.getName()%>"></td>
                        </tr>
                        <% }%>
                    </tbody>
                </table>
            </section>
        </div>
    </div>
    <!-- Main JS -->
    <script src="js/main.js"></script>
    <script src="js/main1.js"></script>
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.js"></script>
</body>
</html>
