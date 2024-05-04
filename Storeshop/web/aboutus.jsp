<%-- 
    Document   : manothers
    Created on : Mar 24, 2024, 5:34:25 PM
    Author     : shali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "en">
	<head>
            
            <style>
   .about-section {
    padding: 100px 0;
    background-color: white;
}

.about-image-container {
    position: relative;
    overflow: hidden;
    border-radius: 8px;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
}

.about-image {
    max-width: 100%;
    height: auto;
    transition: transform 0.3s ease;
}

.about-image-container:hover .about-image {
    transform: scale(1.1);
}

.about-content {
    padding-left: 30px;
}

.about-heading {
    font-size: 36px;
    font-weight: 700;
    margin-bottom: 20px;
    color: ##4BD2DB;
    text-transform: uppercase;
    letter-spacing: 2px;
}

.about-text {
    font-size: 16px;
    line-height: 1.6;
    color: #666;
    margin-bottom: 30px;
}

.about-quote {
    margin-bottom: 40px;
}

.about-quote blockquote {
    font-size: 18px;
    font-style: italic;
    color: #333;
    border-left: 3px solid #4BD2DB;
    padding-left: 20px;
}

.about-btn {
    display: inline-block;
    padding: 12px 30px;
    background-color: #4BD2DB;
    color: white;
    font-weight: 600;
    text-transform: uppercase;
    border-radius: 30px;
    text-decoration: none;
    transition: background-color 0.3s ease;
}

.about-btn:hover {
    background-color: whitesmoke;
}  
 body {
     
      justify-content: center;
      align-items: center;
      min-height: 100vh;
      margin: 199px;
      padding: 0;
      
    }

    .about-section {
      text-align: center;
      /* Additional styles for .about-section */
    }
    </style>

		<title>about us-FUNKYBOYZ</title>
		<meta charset = "utf-8" />
		<meta name = "viewport" content = "width=device-width, initial-scale=1.0" />
		<link rel = "stylesheet" type = "text/css" href = "css/bootstrap.css " />
		<link rel = "stylesheet" type = "text/css" href = "style.css" />
<!--=============== REMIXICONS ===============-->
      <link href="https://cdn.jsdelivr.net/npm/remixicon@3.2.0/fonts/remixicon.css" rel="stylesheet">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="shortcut icon" href="images/fav.png">  
	</head>
        <body align ><br>
<center><div class="logo">
          <img src="images/logo1.png">
    </div></center>
     

      <!--=============== HEADER ===============-->
     <jsp:include page="includes/navBar.jsp" />
      
     <section class="about-section">
      <section class="about-section">
    <div class="container">
        <div class="row">
            <div class="col-md-6 order-md-2">
                <div class="about-image-container">
                    <img src="images/about.png" alt="About Image" class="about-image">
                    
                </div>
            </div>
            <div class="col-md-6 order-md-1">
                <div class="about-content">
                    <h2 class="about-heading">About FunkyBoyz</h2>
                    <p class="about-text">At FunkyBoyz, we're all about embracing the new generation of style. From bold prints to cutting-edge designs, our clothing reflects the vibrant energy and individuality of today's fashion-forward youth.</p>
                    <p class="about-text">Founded with a passion for creativity and innovation, FunkyBoyz is committed to providing high-quality, on-trend apparel that allows you to express yourself with confidence.</p>
                    <div class="about-quote">
                        <blockquote>
                            <p>"Join us on this fashion journey and unleash your unique style with FunkyBoyz Clothing Company!"</p>
                        </blockquote>
                    </div>
                    <a href="#" class="about-btn">Shop Now</a>
                </div>
            </div>
        </div>
    </div>
</section>
         </section>
      
       
      
       
<%--=====Footer======--%>
     <jsp:include page="includes/footer.jsp" />

      
      <!--=============== MAIN JS ===============-->
      <script src="js/main.js"></script>
      <script src="js/main1.js"></script>


</body>
<script src = "js/jquery.js"></script>
<script src = "js/bootstrap.js"></script>	
</html>
