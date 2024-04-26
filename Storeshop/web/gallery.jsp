<%-- 
    Document   : manothers
    Created on : Mar 24, 2024, 5:34:25 PM
    Author     : shali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "en">
	<head>
		<title>Hotel Reservation</title>
		<meta charset = "utf-8" />
		<meta name = "viewport" content = "width=device-width, initial-scale=1.0" />
		<link rel = "stylesheet" type = "text/css" href = "css/bootstrap.css " />
		<link rel = "stylesheet" type = "text/css" href = "style.css" />
                <link rel = "stylesheet" type = "text/css" href = "gallery.css" />
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
                 <li><a href="gallery.jsp" class="nav__link">Shirts</a></li>
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
        <br><br>
      <div class="container4">
         CHANGE YOUR LIFESTYLE <br>
<h3 id="our">WITH FASHION</h3>
</div>
  <br>
  <%--======gallery cards edition========*/--%>
  <center>
<div class="container1">
   <div class="row1">
   <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/1118.jpg">
           
           <div class="effect-text">
           <div class="inner">
               <h2>Bangkok city tour</h2>
               <div class="effect-btn">
               <a href="bangkokcitytour.php" class="btn1">Read More</a>
               </div>
               </div>
           </div>
           </div>
       </div>
       </div>
        <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/1115.jpg">
           
           <div class="effect-text">
           <div class="inner">
               <h2>4 Island Tour</h2>
               <div class="effect-btn">
               <a href="4islandtour.php" class="btn1">Read More</a>
               </div>
               </div>
           </div>
           </div>
       </div>
       </div>
        <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/1111.jpg">
           <div class="effect-text">
           <div class="inner">
               <h2>Floating Market</h2>
               <div class="effect-btn">
               <a href="Floating%20Market%20Pattaya.php" class="btn1">Read More</a>
               </div>
               </div>
           </div>
           </div>
       </div>
       </div>
   </div>
</div>
      <br>
  <div class="container1">
   <div class="row1">
   <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/1112.jpg">
           
           <div class="effect-text">
           <div class="inner">
               <h2>Phi Phi Island Tour</h2>
               <div class="effect-btn">
               <a href="Phi%20Phi%20Island%20Tour.php" class="btn1">Read More</a>
               </div>
               </div>
           </div>
           </div>
       </div>
       </div>
        <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/1113.jpg">
           
           <div class="effect-text">
           <div class="inner">
               <h2>Sanctuary of Truth</h2>
               <div class="effect-btn">
               <a href="Sanctuary%20of%20Truth.php" class="btn1">Read More</a>
               </div>
               </div>
           </div>
           </div>
       </div>
       </div>
        <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/1114.jpg">
           
           <div class="effect-text">
           <div class="inner">
               <h2>Under Water World</h2>
               <div class="effect-btn">
               <a href="Under%20Water%20World.php" class="btn1">Read More</a>
               </div>
               </div>
           </div>
           </div>
       </div>
       </div>
   </div> 
      </div>
      <br>
<div class="container1">
   <div class="row1">
   <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/1112.jpg">
           
           <div class="effect-text">
           <div class="inner">
               <h2>Phi Phi Island Tour</h2>
               <div class="effect-btn">
               <a href="Phi%20Phi%20Island%20Tour.php" class="btn1">Read More</a>
               </div>
               </div>
           </div>
           </div>
       </div>
       </div>
        <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/1113.jpg">
           
           <div class="effect-text">
           <div class="inner">
               <h2>Sanctuary of Truth</h2>
               <div class="effect-btn">
               <a href="Sanctuary%20of%20Truth.php" class="btn1">Read More</a>
               </div>
               </div>
           </div>
           </div>
       </div>
       </div>
        <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/1114.jpg">
           
           <div class="effect-text">
           <div class="inner">
               <h2>Under Water World</h2>
               <div class="effect-btn">
               <a href="Under%20Water%20World.php" class="btn1">Read More</a>
               </div>
               </div>
           </div>
           </div>
       </div>
       </div>
   </div> 
      </div>
      <br>
<div class="container1">
   <div class="row1">
   <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/1112.jpg">
           
           <div class="effect-text">
           <div class="inner">
               <h2>Phi Phi Island Tour</h2>
               <div class="effect-btn">
               <a href="Phi%20Phi%20Island%20Tour.php" class="btn1">Read More</a>
               </div>
               </div>
           </div>
           </div>
       </div>
       </div>
        <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/1113.jpg">
           
           <div class="effect-text">
           <div class="inner">
               <h2>Sanctuary of Truth</h2>
               <div class="effect-btn">
               <a href="Sanctuary%20of%20Truth.php" class="btn1">Read More</a>
               </div>
               </div>
           </div>
           </div>
       </div>
       </div>
        <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/1114.jpg">
           
           <div class="effect-text">
           <div class="inner">
               <h2>Under Water World</h2>
               <div class="effect-btn">
               <a href="Under%20Water%20World.php" class="btn1">Read More</a>
               </div>
               </div>
           </div>
           </div>
       </div>
       </div>
   </div> 
      </div>
</center>
      <br><br><br> 
      <%--======card carosal=====--%>
      <div class="container17">
         <div class="container-fluid">
           
        
                 <div class="slide">
         
                     
                     <div class="item" style="background-image: url(./images/1112.jpg);">
                         
                     </div>
                     <div class="item" style="background-image: url(./images/1113.jpg);">
                         
                     </div>
                     <div class="item" style="background-image: url(./images/1114.jpg);">
                         
                     </div>
                     <div class="item" style="background-image: url(./images/1119.jpg);">
                         
                     </div>
                     <div class="item" style="background-image: url(./images/1117.jpg);">
                         
                     </div>
                     
                     
                     
         
                 </div>
         
                 <div class="button">
                     <button class="prev"><i class="fa-solid fa-arrow-left"></i></button>
                     <button class="next"><i class="fa-solid fa-arrow-right"></i></button>
                 </div>
        
             </div>
             
             </div> 
             <br><br> 
<%--=====Footer======--%>
     <br><br><br>
      <footer>
         <div class="container6">
             <div class="row6">
                   <div class="col6" id="company">
                       <img src="images/logo.png" alt="" class="logo">
                       <p>
                         We are specialized in designings, make your business a brand.
                         Try our premium services.
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
 
                   <div class="col6" id="useful-links">
                      <h3>Links</h3>
                      <div class="links">
                         <a href="aboutus.jsp">About</a>
                         <a href="#">Men</a>
                         <a href="manother.jsp">others</a>
                      </div>
                   </div>
 
                   <div class="col6" id="contact">
                       <h3>Contact</h3>
                       <div class="contact-details">
                          <i class="fa fa-location"></i>
                          <p>FF-42, Procube Avenue, <br> NY, USA</p>
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
            color: selectedColor,
            size: selectedSize,
            quantity: quantity
        };

        var cart = JSON.parse(localStorage.getItem('cart') || '[]');
        cart.push(productDetails);
        localStorage.setItem('cart', JSON.stringify(cart));

        updateCartCount();
        hideProductDetails();
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


    </script>
</body>
<script src = "js/jquery.js"></script>
<script src = "js/bootstrap.js"></script>	
</html>
