<%-- 
    Document   : t-shirts
    Created on : Apr 5, 2024, 9:15:04 PM
    Author     : shali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "en">
	<head>
		<title>T-shirts-FUNKYBOYZ</title>
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
          <div class="search-container">
            <input type="text" id="searchInput" onkeyup="filterItems()" placeholder="Search for items...">
        </div>
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
                         <a href="login.jsp"  class="nav__link">My Account<i class="fa fa-user" aria-hidden="true"></i></a>
</div></li>
          <li class="dropdown__item">
                     <div class="nav__link">
                         <a href="cart.jsp"  class="nav__link"><span class="totalQuantity"  id="cart-count">0</span>
  <i class="fa fa-cart-arrow-down" aria-hidden="true"></i>  <!-- Initial count is 0 -->My Cart
</a>
</div></li>

                  </ul>
                
            </div>
         </nav>
      </header>
      
      <br><br>
      
    <div class="t-shirtsheader"><br><br><br><br><br><br>
    <div class="tspheader">
    <h1>T-Shirts</h1><br>
    <h4><a href="index.jsp">Home</a>/Shop</h4>
    </div>
    
</div>
      <br><br><br><br>
       <!-- Product cards are the same, but I will include the 'data-id' to uniquely identify them -->
    <div class="products-grid">
        <!-- Product Card 1 -->
        <div class="product-card" data-id="1" data-title="color Shirt" data-price="178.36" onmouseover="showSelectButton(this)" onmouseout="hideSelectButton(this)" onclick="showProductDetails(this)">
            <div class="product-image">
                <img id="cardimg" src="images/4.jpg">
            </div>
            <div class="select-button">Select item</div>
            <div class="product-info">
                <h3>Crew Neck Slim Fit T-shirt</h3>
                <p> Rs 2,590.00</p>
            </div>
        </div>
        <div class="product-card" data-id="2" data-title="color2 Shirt" data-price="228.36" onmouseover="showSelectButton(this)" onmouseout="hideSelectButton(this)" onclick="showProductDetails(this)">
            <div class="product-image">
                <img id="cardimg" src="images/5.jpg">
            </div>
            <div class="select-button">Select item</div>
            <div class="product-info">
                <h3>Colorful2 Shirt</h3>
                <p> $328.50</p>
            </div>
        </div>
        <div class="product-card" data-id="3" data-title="color3 Shirt" data-price="378.36" onmouseover="showSelectButton(this)" onmouseout="hideSelectButton(this)" onclick="showProductDetails(this)">
            <div class="product-image">
                <img id="cardimg" src="images/6.jpg">
            </div>
            <div class="select-button">Select item</div>
            <div class="product-info">
                <h3>Colorful3 Shirt</h3>
                <p> $278.50</p>
            </div>
        </div>
        <div class="product-card" data-id="4" data-title="color14 Shirt" data-price="428.36" onmouseover="showSelectButton(this)" onmouseout="hideSelectButton(this)" onclick="showProductDetails(this)">
            <div class="product-image">
                <img id="cardimg" src="images/7.jpg">
            </div>
            <div class="select-button">Select item</div>
            <div class="product-info">
                <h3>Colorful14 Shirt</h3>
                <p> $328.50</p>
            </div>
        </div>
        <div class="product-card" data-id="5" data-title="color5 Shirt" data-price="578.36" onmouseover="showSelectButton(this)" onmouseout="hideSelectButton(this)" onclick="showProductDetails(this)">
            <div class="product-image">
                <img id="cardimg" src="images/8.jpg">
            </div>
            <div class="select-button">Select item</div>
            <div class="product-info">
                <h3>Colorful5 Shirt</h3>
                <p> $278.50</p>
            </div>
        </div>
        <div class="product-card" data-id="6" data-title="color16 Shirt" data-price="628.36" onmouseover="showSelectButton(this)" onmouseout="hideSelectButton(this)" onclick="showProductDetails(this)">
            <div class="product-image">
                <img id="cardimg" src="images/9.jpg">
            </div>
            <div class="select-button">Select item</div>
            <div class="product-info">
                <h3>Colorful16 Shirt</h3>
                <p> $328.50</p>
            </div>
        </div>
        <div class="product-card" data-id="7" data-title="color7 Shirt" data-price="778.36" onmouseover="showSelectButton(this)" onmouseout="hideSelectButton(this)" onclick="showProductDetails(this)">
            <div class="product-image">
                <img id="cardimg" src="images/10.jpg">
            </div>
            <div class="select-button">Select item</div>
            <div class="product-info">
                <h3>Colorful7 Shirt</h3>
                <p> $278.50</p>
            </div>
        </div>
        <div class="product-card" data-id="8" data-title="color18 Shirt" data-price="828.36" onmouseover="showSelectButton(this)" onmouseout="hideSelectButton(this)" onclick="showProductDetails(this)">
            <div class="product-image">
                <img id="cardimg" src="images/12.jpg">
            </div>
            <div class="select-button">Select item</div>
            <div class="product-info">
                <h3>Colorful18 Shirt</h3>
                <p> $328.50</p>
            </div>
        </div>
        
  <!-- Repeat for other product cards -->
    </div>
    <%--=====Footer======--%>
     <br><br><br>
      <footer>
         <div class="container6">
             <div class="row6">
                   <div class="col6" id="company">
                       <img src="images/logo.png" alt="" class="logo">
                       <p>
                         We are provided better designings, make your look a brand.
                         Try our premium cloths.
                       </p>
                       <div class="social6">
                         <a href="#"><i class="fab fa-facebook"></i></a>
                         <a href="#"><i class="fab fa-instagram"></i></a>
                         <a href="#"><i class="fab fa-youtube"></i></a>
                         <a href="#"><i class="fab fa-twitter"></i></a>
                         <a href="#"><i class="fab fa-linkedin"></i></a>
                       </div>
                   </div>
 
 
                   <div class="col6" id="services">
                      <h3>Favourite</h3>
                      <div class="links">
                         <a href="mtrouser.jsp">Man Trousers</a>
                         <a href="mshirt.jsp">Shirts</a>
                         <a href="gallery.jsp">gallery</a>
                         <a href="shorts.jsp">Shorts</a>
                      </div>
                   </div>
 
                   
 
                   <div class="col6" id="contact">
                       <a href="contact us.jsp"><h3>Contact</h3></a>
                       <div class="links">
                               <a href="contact us.jsp">For Any Inquiry</a>
                       </div><br>
                       <div class="contact-details">
                           
                          <i class="fa fa-location"></i>
                          <p>FF-42, FUNKYBOYZ Shop <br> main street, colombo.</p>
                       </div>
                       <div class="contact-details">
                          <i class="fa fa-phone"></i>
                          <p>+1-8755856858</p>
                       </div>
                   </div>
             </div>
 <br><br><br><br>
             <div class="col6" >
                <div class="col61">      
                    <font size="4.3rem" > All Right Received.</font>
                </div>
                   </div>
 
         </div>
      </footer> 

    <!-- ... [rest of your existing code for modal] ... -->

    <!-- The modal now includes selections for size and color -->
    <div class="product-details-modal" id="productDetailsModal">
        <div class="modal-content">
            <span class="close" onclick="hideProductDetails()">&times;</span>
            <div class="modal-body">
                <div class="modal-images">
                    <img id="modalImage"  alt="Shirt Image" class="main-image">
                    
                </div>
            <div class="modal-details">
                <h3 id="modalTitle"></h3>
                <p id="modalPrice"></p>
                <div class="quantity-options">
                    <label for="quantity">Quantity:</label>
                    <input type="number" id="quantity" name="quantity" min="1" value="1"</td>
                </div>
                <div class="color-options">
                    <label for="quantity">Color:</label>
                    <button class="color-red" onclick="selectColor('red')"></button>
                    <button class="color-blue" onclick="selectColor('blue')"></button>
                    <button class="color-black" onclick="selectColor('black')"></button>
                    <button class="color-yellow" onclick="selectColor('yellow')"></button>
                </div>
                <div class="size-options">
                    <label for="quantity">Size:</label>
                        <button onclick="selectSize('S')">S</button>
                        <button onclick="selectSize('M')">M</button>
                        <button onclick="selectSize('L')">L</button>
                        <button onclick="selectSize('XL')">XL</button>
                        <button onclick="selectSize('XXL')">XXL</button>
                </div>
                <button class="add-to-cart-btn" onclick="addToCart()">Add to cart</button>
            </div>
        </div>
    </div>

    <!-- ... [rest of your existing code] ... -->
      


<!--=============== MAIN JS ===============-->
      <script src="js/main.js"></script>
      <script src="js/main1.js"></script>
      
    <script>
         
    function showSelectButton(cardElement) {
        cardElement.getElementsByClassName('select-button')[0].style.display = 'block';
    }

    function hideSelectButton(cardElement) {
        cardElement.getElementsByClassName('select-button')[0].style.display = 'none';
    }

    function showProductDetails(cardElement) {
        var title = cardElement.getAttribute('data-title');
        var price = cardElement.getAttribute('data-price');
        var imageSrc = cardElement.querySelector('img').src;  // Get the image source from the card

        document.getElementById('modalTitle').textContent = title;
        document.getElementById('modalPrice').textContent = price;
        document.getElementById('modalImage').src = imageSrc; // Set the image source in the modal

        document.getElementById('productDetailsModal').style.display = 'block';
        selectedProduct = cardElement; // Store reference to the selected product card
        // Reset color and size selections
        selectedColor = '';
        selectedSize = '';
    }

    function hideProductDetails() {
        document.getElementById('productDetailsModal').style.display = 'none';
    }

    function selectColor(color) {
        selectedColor = color;
        var buttons = document.querySelectorAll('.color-options button');
        buttons.forEach(function(btn) {
            btn.classList.remove('selected');
        });
        document.querySelector('.color-' + color).classList.add('selected');
    }

    function selectSize(size) {
        selectedSize = size;
        var buttons = document.querySelectorAll('.size-options button');
        buttons.forEach(function(btn) {
            btn.classList.remove('selected');
        });
        Array.from(buttons).find(btn => btn.textContent === size).classList.add('selected');
    }

function addToCart() {
    var quantity = document.getElementById('quantity').value;
    var productDetails = {
        id: selectedProduct.getAttribute('data-id'),
        title: selectedProduct.getAttribute('data-title'),
        price: selectedProduct.getAttribute('data-price'),
        image: selectedProduct.querySelector('img').src,
        color: selectedColor, // Make sure this is set by selectColor function
        size: selectedSize,   // Make sure this is set by selectSize function
        quantity: quantity
    };

    // Add the item to the cart in localStorage
    var cart = JSON.parse(localStorage.getItem('cart') || '[]');
    cart.push(productDetails);
    localStorage.setItem('cart', JSON.stringify(cart));

    updateCartCount(); // Reflect the cart count in UI
    hideProductDetails(); // Hide the product details modal
}

    function updateCartCount() {
        var cartCountElement = document.getElementById('cart-count');
        var cart = JSON.parse(localStorage.getItem('cart') || '[]');
        var totalCount = cart.reduce((total, item) => total + parseInt(item.quantity), 0);
        cartCountElement.innerText = totalCount;
        
    }

    document.addEventListener('DOMContentLoaded', function() {
        updateCartCount(); // Update the cart count when the page loads
    });

  function filterItems() {
    var input, filter, cards, cardContainer, h3, title, i;
    input = document.getElementById("searchInput");
    filter = input.value.toUpperCase();
    cardContainer = document.getElementsByClassName("products-grid")[0];
    cards = cardContainer.getElementsByClassName("product-card");
    for (i = 0; i < cards.length; i++) {
        title = cards[i].dataset.title; // Assuming the title is stored in data-title attribute
        if (title.toUpperCase().indexOf(filter) > -1) {
            cards[i].style.display = "";
        } else {
            cards[i].style.display = "none";
        }
    }
}
    </script>

      
 
</body>
<script src = "js/jquery.js"></script>
<script src = "js/bootstrap.js"></script>	
</html>