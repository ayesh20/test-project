<%-- 
    Document   : checkout
    Created on : Apr 26, 2024, 8:52:57 AM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>checkout-FUNKYBOYZ</title>
		<meta charset = "utf-8" />
    
    <!-- custom css file link  -->
    <link rel="stylesheet" href="style.css">

</head>
<body>

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
        </div>
    </form>

</div>    
    
</body>
</html>