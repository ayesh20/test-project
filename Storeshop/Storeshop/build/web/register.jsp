<%-- 
    Document   : register
    Created on : Apr 6, 2024, 10:39:16 PM
    Author     : shali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "en">
	<head>
		<title>register-FUNKYBOYZ</title>
		<meta charset = "utf-8" />
		<meta name = "viewport" content = "width=device-width, initial-scale=1.0" />
		<link rel = "stylesheet" type = "text/css" href = "css/bootstrap.css " />
		<link rel = "stylesheet" type = "text/css" href = "style.css" />
<!--=============== REMIXICONS ===============-->
      <link href="https://cdn.jsdelivr.net/npm/remixicon@3.2.0/fonts/remixicon.css" rel="stylesheet">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="shortcut icon" href="images/fav.png">  
     <style>

body
	{
		background-image:url("images/1112.jpg");
	    background-attachment: fixed;
		background-repeat: no-repeat;
		background-position: center;
        backface-visibility: hidden;
        
      
</style>
<script>
function x()
{
if(document.log.name.value==="")
{
alert("name missing");
}
else if(document.log.email.value==="")
{
alert("email missing");
}
else if(document.log.password.value.length<6)
{
alert("Enter 6 caractors password");
}
if(document.log.password.value!==document.log.cpassword.value)
{
alert("re enter password is worng");
}
if(document.log.country.value==="")
{
alert("country missing");
}
}
</script>

	</head>
        <body  ><br>
<center><div class="logo">
          <img src="images/logo1.png">
    </div></center>
     
     
<body>
 	 
<!-- body code goes here -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> 
	<script src="js/jquery-3.4.1.min.js"></script>

	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/popper.min.js"></script> 
	<script src="js/bootstrap-4.4.1.js"></script>
<br><br>

<div class="container" id="form1">
 <form action="" method="post">
      <h3 id="heading3">Register now</h3>

     <div class="inputbox1">
          
     <input type="name" name="name" required>
          <label for="" >Name</label>
     </div>
      <div class="inputbox1">
          
     <input type="email" name="email" required>
          <label for="" >Email</label>
     </div>
     <div class="inputbox1">
        
     <input type="password" name="password" required>
          <label for="" >Password</label>
     </div>
     <div class="inputbox1">
          
     <input type="password" name="cpassword" required>
          <label for="" >Re-enter password</label>
     </div>
     <div class="inputbox1">
          
     <input type="text" name="country" required>
          <label for="" >Country</label>
     </div>
     <div class="team">
        
         <div>
         <button type="submit" name="submit" id="butt" onClick="x()" class="form-btn" >Register</button>
         <div class="register">
             <p>Already have an account <a href="login.jsp">Log in</a></p>
            </div>
           
         </div>
     </div>
      <p><a href="index.jsp"><font color="white">  <i class="fa fa-home" aria-hidden="true"  ></i></font></a></p>
   </form>
</div>


</body>
<script src = "js/jquery.js"></script>
<script src = "js/bootstrap.js"></script>	
</html>
