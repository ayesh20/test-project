<%-- 
    Document   : manothers
    Created on : Mar 24, 2024, 5:34:25 PM
    Author     : shali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "en">
	<head>
		<title>Contact us | FUNKYBOYZ</title>
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
               <a href="#" class="nav__logo"></a>
               
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
      
      <div class="Contact"><br><br><br><br><br><br>
          <h2>Contact US</h2><br>
          <h4><a href="index.jsp">Home</a>/Contact us</h4>
          <br><br><br><br><br><br><br><br><br>
      </div>
      
          <div class="contact-us">
              <section>
          <div class="con-form"><br>
            <h2 class="title1">For Any Inquiry</h2>
            <form action="">
                <input type="text" class="inp_box" placeholder="Name" required><br><br>
                <input type="text" class="inp_box" placeholder="Email" required><br><br>
                <input type="number" class="inp_box" placeholder="Phone Number" required><br><br>
                <textarea type="text" class="inp_box text_area" placeholder="Message" required></textarea><br><br>

                <button class="btn2">Send</button>
              </form>
        </div>
            
            </tbody>
          </table>
        </section>
        </div>
      
      
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
 
                 <br>
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
  // Function to update cart count
  function updateCartCount() {
    $.ajax({
      url: 'path_to_your_cart_count_endpoint', // Backend URL that returns cart count
      type: 'GET',
      success: function(count) {
        $('#cart-count').text(count); // Update the cart count display
      },
      error: function() {
        console.error('Failed to fetch cart count');
      }
    });
  }

  // Call updateCartCount on page load
  $(document).ready(function() {
    updateCartCount();
  });

  // Assuming you have some button or link to add items to the cart
  $('.add-to-cart-button').on('click', function() {
    // ... your code to add an item to the cart ...

    // After adding to cart, update the cart count
    updateCartCount();
  });
</script>

</body>
<script src = "js/jquery.js"></script>
<script src = "js/bootstrap.js"></script>	
</html>
