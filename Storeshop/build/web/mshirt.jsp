<%@page import="java.util.ArrayList"%>
<%@page import="store.model.Cart"%>
<%@page import="store.model.User"%>
<%@page import="store.dao.ProductsDao"%>
<%@page import="store.model.Product"%>
<%@page import="java.util.List"%>
<%@page import="store.connection.DbConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Shirts</title>
    <!-- Include your CSS stylesheets here -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="style.css" />
    <link href="https://cdn.jsdelivr.net/npm/remixicon@3.2.0/fonts/remixicon.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="shortcut icon" href="images/fav.png">
</head>
<body>
<%
    User auth = (User) request.getSession().getAttribute("auth");
    if (auth != null) {
        request.setAttribute("person", auth);
    }

    // Create a new instance of ProductsDao
    ProductsDao pd = new ProductsDao(DbConnection.getConnection());

    // Get all products from the database with category "shirts"
    List<Product> shirts = pd.getProductsByCategory("shirts");

    // Check if the list of shirts is empty
    if (shirts.isEmpty()) {
        // Handle the case when there are no shirts in the database
        out.println("<p>No shirts found in the database.</p>");
    } else {
        // Retrieve the cart list from the session
        ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
        if (cart_list != null) {
            request.setAttribute("cart_list", cart_list);
        }
%>
<center><div class="logo">
    <img src="images/logo1.png">
</div></center>

<!--=============== HEADER ===============-->
<jsp:include page="includes/navBar.jsp" />
<br><br>
      
    <div class="mshirtheader"><br><br><br><br><br><br>
    <div class="tspheader">
    <h1>Shirts</h1><br>
    <h4><a href="index.jsp">Home</a>/Shop</h4>
    </div>
    
</div>
      <br><br><br><br>
<!-- Header and other page content here -->
<div class="products-grid">
    <%
        for (Product shirt : shirts) {
    %>
    <div class="product-card" data-id="<%= shirt.getId() %>">
        <div class="product-image">
            <img src="<%= shirt.getImage() %>" alt="<%= shirt.getName() %>">
        </div>
        <div class="product-info">
            <h3><%= shirt.getName() %></h3>
            <p>Rs.<%= shirt.getPrice() %></p>
            <!-- Add other product details here -->
            <form method="post" action="AddToCart">
                <input type="hidden" name="productId" value="<%= shirt.getId() %>">
                <input type="hidden" name="productName" value="<%= shirt.getName() %>">
                <input type="hidden" name="productPrice" value="<%= shirt.getPrice() %>">
                <input type="hidden" name="quantity" value="1">
                <input type="hidden" name="image" value="<%= shirt.getImage() %>">
                <!-- Add a hidden field for the selected size -->
                <input type="hidden" name="size" id="selectedSize" value="S">
                <!-- Change the button type to "submit" -->
                <input type="submit" class="select-button" value="Add to cart">
            </form>
        </div>
    </div>
    <% }
    } %>
</div>

<jsp:include page="includes/footer.jsp" />

<!--=============== MAIN JS ===============-->
<script src="js/main.js"></script>
<script src="js/main1.js"></script>
<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>