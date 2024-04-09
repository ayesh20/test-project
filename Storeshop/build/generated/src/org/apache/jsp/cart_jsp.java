package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang = \"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>clothe store</title>\r\n");
      out.write("\t\t<meta charset = \"utf-8\" />\r\n");
      out.write("\t\t<meta name = \"viewport\" content = \"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("\t\t<link rel = \"stylesheet\" type = \"text/css\" href = \"css/bootstrap.css \" />\r\n");
      out.write("\t\t<link rel = \"stylesheet\" type = \"text/css\" href = \"style.css\" />\r\n");
      out.write("<!--=============== REMIXICONS ===============-->\r\n");
      out.write("      <link href=\"https://cdn.jsdelivr.net/npm/remixicon@3.2.0/fonts/remixicon.css\" rel=\"stylesheet\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\" integrity=\"sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/fav.png\">  \r\n");
      out.write("\t</head>\r\n");
      out.write("        <body  ><br>\r\n");
      out.write("<center><div class=\"logo\">\r\n");
      out.write("          <img src=\"images/logo1.png\">\r\n");
      out.write("    </div></center>\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("      <!--=============== HEADER ===============-->\r\n");
      out.write("     <header class=\"header\" >\r\n");
      out.write("         <nav class=\"nav container\">\r\n");
      out.write("            <div class=\"nav__data\">\r\n");
      out.write("               <a href=\"#\" class=\"nav__logo\">\r\n");
      out.write("                 \r\n");
      out.write("          \r\n");
      out.write("                  \r\n");
      out.write("               </a>\r\n");
      out.write("               \r\n");
      out.write("               <div class=\"nav__toggle\" id=\"nav-toggle\">\r\n");
      out.write("                  <i class=\"ri-menu-line nav__burger\"></i>\r\n");
      out.write("                  <i class=\"ri-close-line nav__close\"></i>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!--=============== NAV MENU ===============-->\r\n");
      out.write("            <div class=\"nav__menu\" id=\"nav-menu\">\r\n");
      out.write("               <ul class=\"nav__list\">\r\n");
      out.write("                  <li><a href=\"index.jsp\" class=\"nav__link\">Home</a></li>\r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("\r\n");
      out.write("                  <!--=============== DROPDOWN 2 ===============-->\r\n");
      out.write("                 <li><a href=\"gallery.jsp\" class=\"nav__link\">Shirts</a></li>\r\n");
      out.write("                 <li><a href=\"t-shirt.jsp\" class=\"nav__link\">T-Shirts</a></li>\r\n");
      out.write("                 <li><a href=\"mtrouser.jsp\" class=\"nav__link\">Pants</a></li>\r\n");
      out.write("                 <li><a href=\"shorts.jsp\" class=\"nav__link\">Shorts</a></li>\r\n");
      out.write("              <li><a href=\"gallery.jsp\" class=\"nav__link\">Gallery</a></li>\r\n");
      out.write("                  <li><a href=\"aboutus.jsp\" class=\"nav__link\">About us</a></li>\r\n");
      out.write("                  <li class=\"dropdown__item\">\r\n");
      out.write("                     <div class=\"nav__link\">\r\n");
      out.write("                         <a href=\"login.jsp\" id=\"cdn\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i>My Account</a>\r\n");
      out.write("</div></li>\r\n");
      out.write("          <li class=\"dropdown__item\">\r\n");
      out.write("                     <div class=\"nav__link\">\r\n");
      out.write("                         <a href=\"cart.jsp\" id=\"cdn\"><span class=\"totalQuantity\"  id=\"cart-count\">0</span>\r\n");
      out.write("  <i class=\"fa fa-cart-arrow-down\" aria-hidden=\"true\"></i>  <!-- Initial count is 0 -->My Cart\r\n");
      out.write("</a>\r\n");
      out.write("</div></li>\r\n");
      out.write("\r\n");
      out.write("                  </ul>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("         </nav>\r\n");
      out.write("      </header>\r\n");
      out.write("      \r\n");
      out.write("       \r\n");
      out.write("      \r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("     <br><br><br>\r\n");
      out.write("      <footer>\r\n");
      out.write("         <div class=\"container6\">\r\n");
      out.write("             <div class=\"row6\">\r\n");
      out.write("                   <div class=\"col6\" id=\"company\">\r\n");
      out.write("                       <img src=\"images/logo.png\" alt=\"\" class=\"logo\">\r\n");
      out.write("                       <p>\r\n");
      out.write("                         We are specialized in designings, make your business a brand.\r\n");
      out.write("                         Try our premium services.\r\n");
      out.write("                       </p>\r\n");
      out.write("                       <div class=\"social6\">\r\n");
      out.write("                         <a href=\"#\"><i class=\"fab fa-facebook\"></i></a>\r\n");
      out.write("                         <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                         <a href=\"#\"><i class=\"fab fa-youtube\"></i></a>\r\n");
      out.write("                         <a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                         <a href=\"#\"><i class=\"fab fa-linkedin\"></i></a>\r\n");
      out.write("                       </div>\r\n");
      out.write("                   </div>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("                   <div class=\"col6\" id=\"services\">\r\n");
      out.write("                      <h3>Favourite</h3>\r\n");
      out.write("                      <div class=\"links\">\r\n");
      out.write("                         <a href=\"mtrouser.jsp\">Man Trousers</a>\r\n");
      out.write("                         <a href=\"mshirt.jsp\">Shirts</a>\r\n");
      out.write("                         <a href=\"gallery.jsp\">gallery</a>\r\n");
      out.write("                         <a href=\"shorts.jsp\">Shorts</a>\r\n");
      out.write("                      </div>\r\n");
      out.write("                   </div>\r\n");
      out.write(" \r\n");
      out.write("                   \r\n");
      out.write(" \r\n");
      out.write("                   <div class=\"col6\" id=\"contact\">\r\n");
      out.write("                       <h3>Contact</h3>\r\n");
      out.write("                       <div class=\"contact-details\">\r\n");
      out.write("                          <i class=\"fa fa-location\"></i>\r\n");
      out.write("                          <p>FF-42, Procube Avenue, <br> NY, USA</p>\r\n");
      out.write("                       </div>\r\n");
      out.write("                       <div class=\"contact-details\">\r\n");
      out.write("                          <i class=\"fa fa-phone\"></i>\r\n");
      out.write("                          <p>+1-8755856858</p>\r\n");
      out.write("                       </div>\r\n");
      out.write("                   </div>\r\n");
      out.write("             </div>\r\n");
      out.write(" <br><br><br><br>\r\n");
      out.write("             <div class=\"col6\" >\r\n");
      out.write("                <div class=\"col61\">      \r\n");
      out.write("                    <font size=\"4.3rem\" > All Right Received.</font>\r\n");
      out.write("                </div>\r\n");
      out.write("                   </div>\r\n");
      out.write(" \r\n");
      out.write("         </div>\r\n");
      out.write("      </footer> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      <!--=============== MAIN JS ===============-->\r\n");
      out.write("      <script src=\"js/main.js\"></script>\r\n");
      out.write("      <script src=\"js/main1.js\"></script>\r\n");
      out.write("      <script>\r\n");
      out.write("  // Function to update cart count\r\n");
      out.write("  function updateCartCount() {\r\n");
      out.write("    $.ajax({\r\n");
      out.write("      url: 'path_to_your_cart_count_endpoint', // Backend URL that returns cart count\r\n");
      out.write("      type: 'GET',\r\n");
      out.write("      success: function(count) {\r\n");
      out.write("        $('#cart-count').text(count); // Update the cart count display\r\n");
      out.write("      },\r\n");
      out.write("      error: function() {\r\n");
      out.write("        console.error('Failed to fetch cart count');\r\n");
      out.write("      }\r\n");
      out.write("    });\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  // Call updateCartCount on page load\r\n");
      out.write("  $(document).ready(function() {\r\n");
      out.write("    updateCartCount();\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("  // Assuming you have some button or link to add items to the cart\r\n");
      out.write("  $('.add-to-cart-button').on('click', function() {\r\n");
      out.write("    // ... your code to add an item to the cart ...\r\n");
      out.write("\r\n");
      out.write("    // After adding to cart, update the cart count\r\n");
      out.write("    updateCartCount();\r\n");
      out.write("  });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src = \"js/jquery.js\"></script>\r\n");
      out.write("<script src = \"js/bootstrap.js\"></script>\t\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
