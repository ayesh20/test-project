<%-- 
    Document   : manothers
    Created on : Mar 24, 2024, 5:34:25 PM
    Author     : shali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "en">
	<head>
		<title>gallery-FUNKYBOYZ</title>
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
     <jsp:include page="includes/navBar.jsp" />
        <br><br>
      <div class="container4">
         CHANGE YOUR LIFESTYLE <br>
<h3 id="our">WITH FASHION</h3>
</div>
  <br>
  <%--======gallery cards edition========*/--%>
  <%--======gallery cards edition========*/--%>
  <center>
<div class="container1">
   <div class="row1">
   <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/gallery1.jpg">
           
           
           </div>
       </div>
       </div>
        <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/gallery2.jpg">
           
           
           </div>
       </div>
       </div>
        <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/gallery3.jpg">
         
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
           <img src="images/gallery4.jpg">
           
           
           </div>
       </div>
       </div>
        <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/gallery5.jpg">
           
           
           </div>
       </div>
       </div>
        <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/gallery6.jpg">
           
        
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
           <img src="images/gallery7.jpg">
           
           
           </div>
       </div>
       </div>
        <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/gallery8.jpg">
           
           
           </div>
       </div>
       </div>
        <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/gallery9.jpg">
           
           
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
           <img src="images/gallery10.jpg">
           
           
           </div>
       </div>
       </div>
        <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/gallery11.jpg">
           
           </div>
       </div>
       </div>
        <div class="column">
       <div class="effect">
       <div class="effect-img">
           <img src="images/gallery12.jpg">
           
           
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
         
                     
                     <div class="item" style="background-image: url(./images/gallery5.jpg);">
                         
                     </div>
                     <div class="item" style="background-image: url(./images/gallery6.jpg);">
                         
                     </div>
                     <div class="item" style="background-image: url(./images/gallery7.jpg);">
                         
                     </div>
                     <div class="item" style="background-image: url(./images/gallery8.jpg);">
                         
                     </div>
                     <div class="item" style="background-image: url(./images/gallery9.jpg);">
                         
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
    <jsp:include page="includes/footer.jsp" /> 


      
      <!--=============== MAIN JS ===============-->
      <script src="js/main.js"></script>
      <script src="js/main1.js"></script>
      
          
</body>
<script src = "js/jquery.js"></script>
<script src = "js/bootstrap.js"></script>	
</html>
