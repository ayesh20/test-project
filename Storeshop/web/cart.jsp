<%-- 
    Document   : manothers
    Created on : Mar 24, 2024, 5:34:25 PM
    Author     : shali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "en">
	<head>
		<title>clothe store</title>
		<meta charset = "utf-8" />
		<meta name = "viewport" content = "width=device-width, initial-scale=1.0" />
		<link rel = "stylesheet" type = "text/css" href = "css/bootstrap.css " />
		<link rel = "stylesheet" type = "text/css" href = "style.css" />
<!--=============== REMIXICONS ===============-->
      <link href="https://cdn.jsdelivr.net/npm/remixicon@3.2.0/fonts/remixicon.css" rel="stylesheet">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="shortcut icon" href="images/fav.png">  
	</head>
        <body  ><br>
<center><div class="logo">
          <img src="images/logo1.png">
    </div></center>
     

      <!--=============== HEADER ===============-->
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
                  <li><a href="index.jsp" class="nav__link">Home</a></li>
                  
                  

                  <!--=============== DROPDOWN 2 ===============-->
                 <li><a href="mshirt.jsp" class="nav__link">Shirts</a></li>
                 <li><a href="t-shirts.jsp" class="nav__link">T-Shirts</a></li>
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
                         <a href="cart.jsp" id="cdn"><span class="totalQuantity"  id="cart-count">0</span>
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
    cartTableBody.innerHTML = ''; // Clear the table body

    // Loop through all cart items and append them to the cart table
    cartItems.forEach((item, index) => {
        var itemPrice = parseFloat(item.price); // Parse the price as a float
        var itemQuantity = parseInt(item.quantity); // Parse the quantity as an integer
        var itemTotal = (itemPrice * itemQuantity).toFixed(2); // Calculate total price for the item

        // Create a new row with the item details
        var row = cartTableBody.insertRow();
        row.innerHTML = `
            <td><img src="${item.image}" style="width: 50px; height: auto;"> ${item.title}<br>Size: ${item.size}<br>Color: ${item.color}</td>
            <td>${itemPrice}</td>
            <td><input type="number" value="${itemQuantity}" min="1" onchange="updateQuantity(this, ${index})"></td>
            <td class="item-total">$${itemTotal}</td>
            <td><button onclick="removeItem(${index})" class="button-remove">Remove</button></td>
        `;
    });

    updateSubtotal(); // Update the subtotal displayed
}
    function updateQuantity(input, index) {
        var cartItems = JSON.parse(localStorage.getItem('cart')) || [];
        cartItems[index].quantity = parseInt(input.value);
        localStorage.setItem('cart', JSON.stringify(cartItems));
        loadCartItems(); // This will update UI
    }

    function removeItem(index) {
        var cartItems = JSON.parse(localStorage.getItem('cart')) || [];
        cartItems.splice(index, 1);
        localStorage.setItem('cart', JSON.stringify(cartItems));
        loadCartItems(); // This will update UI
    }

    function updateSubtotal() {
        var cartItems = JSON.parse(localStorage.getItem('cart')) || [];
        var subtotal = cartItems.reduce((sum, item) => {
            var itemPrice = parseFloat(item.price); // Convert to float
            var itemQuantity = parseInt(item.quantity); // Convert to integer
            return sum + (itemPrice * itemQuantity);
        }, 0);
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
