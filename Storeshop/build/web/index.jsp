<%-- 
    Document   : manothers
    Created on : Mar 24, 2024, 5:34:25 PM
    Author     : shali
--%>

<%@page import="store.model.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="store.dao.ProductsDao"%>
<%@page import="store.model.Product"%>
<%@page import="store.connection.DbConnection"%>
<%@page import="store.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    User auth = (User) request.getSession().getAttribute("auth");
    if (auth != null) {
        request.setAttribute("person", auth);
    }
    ProductsDao pd = new ProductsDao(DbConnection.getConnection());
    List<Product> products = pd.getAllProducts();
    ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
    if (cart_list != null) {
        request.setAttribute("cart_list", cart_list);
    }
%>
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
        <body><br>
<center><div class="logo">
          <img src="images/logo1.png">
    </div></center>
     

      <!--=============== HEADER ===============-->
     <jsp:include page="includes/navBar.jsp" />
      <br>
       <div class="banner">
    <div class="slider">
        <img src="images/carosal1.jpg" id="slideimg">
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
        "images/carosal1.jpg",
            "images/carosal2.jpg",
            "images/carosal3.jpg",
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

    <div class="categories-section">
        <div class="category-image-container">
            <div class="effect-img">
            <a href="idex.jsp" id="main"><img src="images/shirt13.jpg" alt="Category Image 3" class="category-image">
            <div class="inner">
                <h2>SHIRTS</h2>
                        </div></a>
            </div>
            </div>
        <div class="category-image-container">
            <div class="effect-img">
            <a href="idex.jsp" id="main"><img src="images/9.jpg" alt="Category Image 3" class="category-image">
            <div class="inner">
                <h2>SHORTS</h2>
            </div></a>
            </div>
        </div>
        <div class="category-image-container">
            <div class="effect-img">
            <a href="idex.jsp" id="main"><img src="images/pants10.jpg" alt="Category Image 3" class="category-image">
            <div class="inner">
                <h2>SHORTS</h2>
            </div></a>
            </div>
        </div>
        <div class="category-image-container">
            <div class="effect-img">
            <a href="idex.jsp" id="main"><img src="images/i.jpg" alt="Category Image 3" class="category-image">
            <div class="inner">
                <h2>SHORTS</h2>
            </div></a>
            </div>
        </div>
    </div>
</div>
    <div class="header12">
    <h1>OUR PHILOSOPHY</h1>
    <div class="underline"></div>
    <div class="section-container">
  <!-- Section 1 -->
  <div class="section">
    <img src="images/1117.jpg" alt="Hybrid and Inventive Collection">
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
    <img src="images/1116.jpg" alt="A Magesterial Essential for All Wardrobes">
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
       <jsp:include page="includes/footer.jsp" />


      
      <!--=============== MAIN JS ===============-->
      <script src="js/main.js"></script>
      <script src="js/main1.js"></script>


</body>
<script src = "js/jquery.js"></script>
<script src = "js/bootstrap.js"></script>	
</html>
