<%@page import="store.connection.DbConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Cart - FUNKYBOYZ</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="style.css" />
    <!-- Add your other CSS links here -->
    <style>
        .img {
            width: 100px; /* Adjust the width and height as needed */
            height: 100px;
            background-size: cover;
            background-position: center;
        }
    </style>
</head>
<body>
    <center>
        <div class="logo">
            <img src="images/logo1.png">
        </div>
    </center>

    <!-- Header and other page content here -->
    <jsp:include page="includes/navBar.jsp" />

    
    <main class="cart-container">
        <table id="cartTable">
            <thead>
                <tr>
                    <th>Product</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Size</th>
                    <th>Quantity</th>
                    <th>Total</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <%
                    Connection con = DbConnection.getConnection();
                    PreparedStatement pst = con.prepareStatement("SELECT id, name, quantity, price, image FROM cart");
                    ResultSet rs = pst.executeQuery();

                    double grandTotal = 0.0;
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String name = rs.getString("name");
                        double price = rs.getDouble("price");
                        int quantity = rs.getInt("quantity");
                        String image = rs.getString("image");

                        double total = price * quantity;
                        grandTotal += total;
                %>
                <tr class="text-center" id="item_<%= id%>">
                    <td class="image-prod"><div class="img" style="background-image:url(<%= image %>);"></div></td>
                    <td class="product-name"><%= name%></td>
                    <td class="price"><%= price%></td>
                    <td class="size">
                        <input type="radio" name="size_<%= id%>" value="S"> S
                        <input type="radio" name="size_<%= id%>" value="M"> M
                        <input type="radio" name="size_<%= id%>" value="L"> L
                        <input type="radio" name="size_<%= id%>" value="XL"> XL
                    </td>
                    <td class="quantity">
                        <a href="quantity-inc-dec?action=dec&id=<%= id %>&quantity=-1">-</a>
                        <%= quantity %>
                        <a href="quantity-inc-dec?action=inc&id=<%= id %>&quantity=1">+</a>
                    </td>
                    <td class="total" id="total_<%= id %>"><%= total %></td>
                    <td class="product-remove"><a href="./remove-from-cart?id=<%= id %>">x</a></td>
                </tr>
                <%
                    }
                    con.close();
                %>
            </tbody>
        </table>

        <div class="cart-summary">
            <div class="subtotal-section">
                <h2>Subtotal: Rs.<span id="subtotal"><%= grandTotal %></span></h2>
               
            </div>
        </div>
    </main>
<div class="container_checkout">

   <form action="CheckOutServlet" method="post">

        <div class="row_checkout">

<!--Customer Details-->

            <div class="col_checkout">
    <h3 class="title_checkout">Billing Address</h3>
    
        <div class="inputBox_checkout">
            <span>Full Name:</span>
            <input type="text" name="fullName" placeholder="Enter your full name" required>
        </div>
        <div class="inputBox_checkout">
            <span>Email:</span>
            <input type="email" name="email" placeholder="Enter your email" required>
        </div>
        <div class="inputBox_checkout">
            <span>Address:</span>
            <input type="text" name="address" placeholder="Enter your address" required>
        </div>
        <div class="inputBox_checkout">
            <span>City:</span>
            <input type="text" name="city" placeholder="Enter your city" required>
        </div>
        <div class="flex_checkout">
            <div class="inputBox_checkout">
                <span>Contact No:</span>
                <input type="text" name="contactNo" placeholder="Enter your contact number" required>
            </div>
            <div class="inputBox_checkout">
                <span>Zip Code:</span>
                <input type="text" name="zipCode" placeholder="Enter your zip code" required>
            </div>
        </div>
        <input type="submit" value="Proceed to Checkout" class="button1">

</div>

           
<!--Payment col. section-->
            <div class="col_checkout">

                <h3 class="title_checkout">payment</h3>

                <div class="inputBox_checkout">
                    <span>cards accepted :</span>
                    <img src="images/card_img.png" alt="">
                </div>
                <div class="inputBox_checkout">
                    <span>name on card :</span>
                    <input type="text" placeholder="">
                </div>
                <div class="inputBox_checkout">
                    <span>credit card number :</span>
                    <input type="number" placeholder="">
                </div>
                <div class="inputBox_checkout">
                    <span>exp month :</span>
                    <input type="text" placeholder="">
                </div>

                <div class="flex_checkout">
                    <div class="inputBox_checkout">
                        <span>exp year :</span>
                        <input type="number" placeholder="">
                    </div>
                    <div class="inputBox_checkout">
                        <span>CVV :</span>
                        <input type="text" placeholder="">
                    </div>
                </div>

            </div>
     </div>
      
    </form>
  </div>
    <!-- Footer content -->
    <jsp:include page="includes/footer.jsp" />

    <script src="js/main.js"></script>
    <script src="js/main1.js"></script>
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.js"></script>
</body>
</html>
