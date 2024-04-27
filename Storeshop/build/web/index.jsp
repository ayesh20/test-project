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
        <body onload="slider()" ><br>
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
      <br>
       <div class="banner">
    <div class="slider">
        <img src="images/1111.jpg" id="slideimg">
    </div>
    <div class="overlay">
      
        <div class="content">
        <br><br>
            <h2>PRINTED PLAYBOOK</h2>
            <br>
            <h4>Make Your Business A Brand. Make Your Business A Brand.</h4>
            <br><br>
             
            <div>
                <br><br>
            <a> <button type="button" id="button1">Shop Now</button></a>
            </div>
        </div>
    </div>
    </div>
    <script>
        var slideimg= document.getElementById("slideimg");
        var images = new Array(
        "images/1111.jpg",
            "images/1113.jpg",
            "images/1114.jpg",
        );
        var len = images.length;
        var i= 0;
        function slider(){
            if(i > len-1){
                i = 0;
            }
            slideimg.src = images[i];
            i++;
            setTimeout('slider()',4000);
        }
    </script> 
      
    <br><br>
           <div class="categories-title">select item</div>
           <br>
    <div class="categories-section">
        <div class="category-image-container">
            <div class="effect-img">
            <a href="mshirt.jsp" id="main"><img src="images/1114.jpg" alt="Category Image 3" class="category-image">
            <div class="inner">
                <h2>SHIRTS</h2>
                        </div></a>
            </div>
            </div>
        <div class="category-image-container">
            <div class="effect-img">
            <a href="mtrouser.jsp" id="main"><img src="images/1114.jpg" alt="Category Image 3" class="category-image">
            <div class="inner">
                <h2>TROUSERS</h2>
            </div></a>
            </div>
        </div>
        <div class="category-image-container">
            <div class="effect-img">
            <a href="t-shirts.jsp" id="main"><img src="images/1114.jpg" alt="Category Image 3" class="category-image">
            <div class="inner">
                <h2>T-SHIRTS</h2>
            </div></a>
            </div>
        </div>
        <div class="category-image-container">
            <div class="effect-img">
            <a href="shorts.jsp" id="main"><img src="images/1114.jpg" alt="Category Image 3" class="category-image">
            <div class="inner">
                <h2>SHORTS</h2>
            </div></a>
            </div>
        </div>
    </div>
</div>
<br><br><br>
    <div class="header12">
    <h1>OUR PHILOSOPHY</h1>
    <div class="underline"></div>
    <div class="section-container">
        <br><br>
  <!-- Section 1 -->
  <div class="section">
    <img src="images/1113.jpg" alt="Hybrid and Inventive Collection">
    <div class="section-text">
      <div class="section-title">HYBRID AND INVENTIVE</div>
      <div class="section-description">
        LCY set out on an ardent journey of fashion, innovation and entrepreneurship to highlight diverse facets and shades of everyday life.
      </div>
    </div>
  </div>
  <!-- Section 2 -->
  <div class="section">
    <img src="images/1113.jpg" alt="Finer Weave Collection">
    <div class="section-text">
      <div class="section-title">FINER WEAVE</div>
      <div class="section-description">
        Designed to stand out with cultivated flair, our collections are for the suave individuals with refined tastes.
      </div>
    </div>
  </div>
  <!-- Section 3 -->
  <div class="section">
    <img src="images/1113.jpg" alt="A Magesterial Essential for All Wardrobes">
    <div class="section-text">
      <div class="section-title">A MAGISTERIAL ESSENTIAL FOR ALL WARDROBES</div>
      <div class="section-description">
        Our collection enables you to walk the runway of everyday life with a smart style and vibrant tones that blend in with timeless splendour.
      </div>
    </div>
  </div>
</div>
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
            var image = cardElement.getAttribute('data-image');

            var modalTitle = document.querySelector('.modal-details .modal-title');
            var modalPrice = document.querySelector('.modal-details .modal-price');
            var modalImage = document.querySelector('.modal-images .main-image');


            modalTitle.textContent = title;
            modalPrice.textContent = price;
            modalImage.src = image;

            document.getElementById('productDetailsModal').style.display = 'block';
        }

        function hideProductDetails() {
            document.getElementById('productDetailsModal').style.display = 'none';
        }

        // Global variables to keep track of the selected product details
        var selectedColor = '';
        var selectedSize = '';
        var selectedProduct;

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

        function showProductDetails(cardElement) {
            selectedProduct = cardElement; // Store reference to the selected product card
            document.getElementById('modalTitle').textContent = cardElement.getAttribute('data-title');
            document.getElementById('modalPrice').textContent = cardElement.getAttribute('data-price');
             document.getElementById('modalImage').textContent = `$${cardElement.getAttribute('data-image')}`;
            // Reset color and size selections
            selectedColor = '';
            selectedSize = '';
            document.getElementById('productDetailsModal').style.display = 'block';
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
