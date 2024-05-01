<%-- 
    Document   : contact us
    Created on : 26-Apr-2024, 07:52:23
    Author     : yasin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "en">
	<head>
		<title>Contact us-FUNKYBOYZ</title>
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
     <jsp:include page="includes/navBar.jsp" />
      
      <div class="contact"><br><br><br><br><br><br>
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
     <jsp:include page="includes/footer.jsp" />
      
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