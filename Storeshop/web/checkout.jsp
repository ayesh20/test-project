<%-- 
    Document   : checkout
    Created on : Apr 26, 2024, 8:52:57 AM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    
    <!-- custom css file link  -->
    <link rel="stylesheet" href="style.css">

</head>
<body>

<div class="container_checkout">

    <form action="">

        <div class="row_checkout">

<!--Customer Details-->

            <div class="col_checkout">

                <h3 class="title_checkout">billing address</h3>

                <div class="inputBox_checkout">
                    <span>full name :</span>
                    <input type="text" placeholder="">
                </div>
                <div class="inputBox_checkout">
                    <span>email :</span>
                    <input type="email" placeholder="">
                </div>
                <div class="inputBox_checkout">
                    <span>address :</span>
                    <input type="text" placeholder="">
                </div>
                <div class="inputBox_checkout">
                    <span>city :</span>
                    <input type="text" placeholder="">
                </div>

                <div class="flex_checkout">
                    <div class="inputBox_checkout">
                        <span>District :</span>
                        <input type="text" placeholder="">
                    </div>
                    <div class="inputBox_checkout">
                        <span>zip code :</span>
                        <input type="text" placeholder="">
                    </div>
                </div>

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

        <input type="submit" value="proceed to checkout" class="submit-btnch">

    </form>

</div>    
    
</body>
</html>