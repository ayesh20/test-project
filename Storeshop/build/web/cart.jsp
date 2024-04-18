<%-- 
    Document   : manothers
    Created on : Mar 24, 2024, 5:34:25 PM
    Author     : shali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>FUNKYBOYZ Cart</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

    <header class="header" >
        <nav class="nav container">
           <div class="nav__data">
              <a href="#" class="nav__logo">
                
         
                 
              </a>
              
              <div class="nav__toggle" id="nav-toggle">
                 <i class="ri-menu-line nav__burger"></i>
                 <i class="ri-close-line nav__close"></i>
              </div>
           </div>

           <!--=============== NAV MENU ===============-->
           <div class="nav__menu" id="nav-menu">
              <ul class="nav__list">
                 <li><a href="index.html" class="nav__link">Home</a></li>
                 
                 

                 <!--=============== DROPDOWN 2 ===============-->
                <li><a href="gallery.jsp" class="nav__link">Shirts</a></li>
                <li><a href="t-shirt.jsp" class="nav__link">T-Shirts</a></li>
                <li><a href="mtrouser.jsp" class="nav__link">Pants</a></li>
                <li><a href="shorts.jsp" class="nav__link">Shorts</a></li>
             <li><a href="gallery.jsp" class="nav__link">Gallery</a></li>
                 <li><a href="aboutus.jsp" class="nav__link">About us</a></li>
                 <li class="dropdown__item">
                    <div class="nav__link">
                        <a href="login.jsp" id="cdn"><i class="fa fa-user" aria-hidden="true"></i>My Account</a>
</div></li>
         <li class="dropdown__item">
                    <div class="nav__link">
                        <a href="cart.html" id="cdn"><span class="totalQuantity"  id="cart-count">0</span>
 <i class="fa fa-cart-arrow-down" aria-hidden="true"></i>  <!-- Initial count is 0 -->My Cart
</a>
</div></li>

                 </ul>
               
           </div>
        </nav>
     </header>

    <main class="cart-container">
        <table id="cartTable">
            <thead>
                <tr>
                    <th>Product</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Total</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody id="cartItems">
                <!-- Cart items will be dynamically inserted here -->
            </tbody>
        </table>

        <div class="cart-summary">
            
            <div class="subtotal-section">
                <p>Subtotal: $<span id="subtotal">0.00</span></p>
                <button class="button1" onclick="checkout()">Checkout</button>
            </div>
        </div>
    </main>

    <!-- ... (existing footer content) ... -->

    <script>
        function loadCartItems() {
    var cartItems = JSON.parse(localStorage.getItem('cart')) || [];
    var cartTableBody = document.getElementById('cartItems');
    cartTableBody.innerHTML = ''; // Clear the table body to ensure no old data persists

    cartItems.forEach((item, index) => {
        var row = cartTableBody.insertRow();
        row.innerHTML = `
            <td><img src="${item.image}"  style="width: 50px; height: auto;"><  >   ${item.title}<br> ${item.size} <br> ${item.color}</td>
            <td>$${item.price}</td>
            <td><input type="number" value="${item.quantity}" min="1" onchange="updateQuantity(this, ${index})"></td>
            <td class="item-total">$${(item.price * item.quantity).toFixed(2)}</td>
            <td><button onclick="removeItem(${index})" class="button-remove">Remove</button></td>
        `;
    });

    updateSubtotal(); // Update subtotal after the items are reloaded
}


        function updateQuantity(input, index) {
            var cartItems = JSON.parse(localStorage.getItem('cart')) || [];
            cartItems[index].quantity = parseInt(input.value);
            localStorage.setItem('cart', JSON.stringify(cartItems));
            loadCartItems(); // Reload to update the display
        }

        function removeItem(index) {
            var cartItems = JSON.parse(localStorage.getItem('cart')) || [];
            cartItems.splice(index, 1); // Remove the item from the cart
            localStorage.setItem('cart', JSON.stringify(cartItems));
            loadCartItems();
            Location.reload();
             // Reload to update the display
        }

        function updateSubtotal() {
            var cartItems = JSON.parse(localStorage.getItem('cart')) || [];
            var subtotal = cartItems.reduce((sum, item) => sum + item.price * item.quantity, 0);
            document.getElementById('subtotal').textContent = subtotal.toFixed(2);
        }

        function checkout() {
            alert('Proceed to checkout...');
             // Placeholder for actual checkout process
        }

        document.addEventListener('DOMContentLoaded', loadCartItems);
    </script>
</body>
<script src = "js/jquery.js"></script>
<script src = "js/bootstrap.js"></script>	
</html>
