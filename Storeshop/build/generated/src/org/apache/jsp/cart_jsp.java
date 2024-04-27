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
      out.write("\t\t<title>cart-FUNKYBOYZ</title>\r\n");
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
      out.write("          <img src=\"images/logo2.png\">\r\n");
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
      out.write("                 <li><a href=\"mshirt.jsp\" class=\"nav__link\">Shirts</a></li>\r\n");
      out.write("                 <li><a href=\"t-shirts.jsp\" class=\"nav__link\">T-Shirts</a></li>\r\n");
      out.write("                 <li><a href=\"mtrouser.jsp\" class=\"nav__link\">Pants</a></li>\r\n");
      out.write("                 <li><a href=\"shorts.jsp\" class=\"nav__link\">Shorts</a></li>\r\n");
      out.write("              <li><a href=\"gallery.jsp\" class=\"nav__link\">Gallery</a></li>\r\n");
      out.write("                  <li><a href=\"aboutus.jsp\" class=\"nav__link\">About us</a></li>\r\n");
      out.write("                  <li class=\"dropdown__item\">\r\n");
      out.write("                     <div class=\"nav__link\">\r\n");
      out.write("                         <a href=\"login.jsp\"  class=\"nav__link\">My Account<i class=\"fa fa-user\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("</div></li>\r\n");
      out.write("          <li class=\"dropdown__item\">\r\n");
      out.write("                     <div class=\"nav__link\">\r\n");
      out.write("                         <a href=\"cart.jsp\"  class=\"nav__link\"><span class=\"totalQuantity\"  id=\"cart-count\">0</span>\r\n");
      out.write("  <i class=\"fa fa-cart-arrow-down\" aria-hidden=\"true\"></i>  <!-- Initial count is 0 -->My Cart\r\n");
      out.write("</a>\r\n");
      out.write("</div></li>\r\n");
      out.write("\r\n");
      out.write("                  </ul>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("         </nav>\r\n");
      out.write("      </header>\r\n");
      out.write("\r\n");
      out.write("    <main class=\"cart-container\">\r\n");
      out.write("        <table id=\"cartTable\">\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>Product</th>\r\n");
      out.write("                    <th>Price</th>\r\n");
      out.write("                    <th>Quantity</th>\r\n");
      out.write("                    <th>Total</th>\r\n");
      out.write("                    <th>Action</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody id=\"cartItems\">\r\n");
      out.write("                <!-- Cart items will be dynamically inserted here -->\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"cart-summary\">\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"subtotal-section\">\r\n");
      out.write("                <p>Subtotal: Rs.<span id=\"subtotal\">0.00</span></p>\r\n");
      out.write("                <button class=\"button1\" onclick=\"checkout()\">Checkout</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </main>\r\n");
      out.write("\r\n");
      out.write("    <!-- ... (existing footer content) ... -->\r\n");
      out.write("\r\n");
      out.write("    <!--=============== MAIN JS ===============-->\r\n");
      out.write("      <script src=\"js/main.js\"></script>\r\n");
      out.write("      <script src=\"js/main1.js\"></script>\r\n");
      out.write("      \r\n");
      out.write(" <script>\r\n");
      out.write("   function loadCartItems() {\r\n");
      out.write("    var cartItems = JSON.parse(localStorage.getItem('cart')) || [];\r\n");
      out.write("    var cartTableBody = document.getElementById('cartItems');\r\n");
      out.write("    cartTableBody.innerHTML = ''; // Clear the table body\r\n");
      out.write("\r\n");
      out.write("    // Loop through all cart items and append them to the cart table\r\n");
      out.write("    cartItems.forEach((item, index) => {\r\n");
      out.write("        var itemPrice = parseFloat(item.price); // Parse the price as a float\r\n");
      out.write("        var itemQuantity = parseInt(item.quantity); // Parse the quantity as an integer\r\n");
      out.write("        var itemTotal = (itemPrice * itemQuantity).toFixed(2); // Calculate total price for the item\r\n");
      out.write("\r\n");
      out.write("        // Create a new row with the item details\r\n");
      out.write("        var row = cartTableBody.insertRow();\r\n");
      out.write("        row.innerHTML = `\r\n");
      out.write("            <td><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"width: 50px; height: auto;\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>Size: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>Color: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${itemPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("            <td><input type=\"number\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${itemQuantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" min=\"1\" onchange=\"updateQuantity(this, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(")\"></td>\r\n");
      out.write("            <td class=\"item-total\">$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${itemTotal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("            <td><button onclick=\"removeItem(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(")\" class=\"button-remove\">Remove</button></td>\r\n");
      out.write("        `;\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    updateSubtotal(); // Update the subtotal displayed\r\n");
      out.write("}\r\n");
      out.write("    function updateQuantity(input, index) {\r\n");
      out.write("        var cartItems = JSON.parse(localStorage.getItem('cart')) || [];\r\n");
      out.write("        cartItems[index].quantity = parseInt(input.value);\r\n");
      out.write("        localStorage.setItem('cart', JSON.stringify(cartItems));\r\n");
      out.write("        loadCartItems(); // This will update UI\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function removeItem(index) {\r\n");
      out.write("        var cartItems = JSON.parse(localStorage.getItem('cart')) || [];\r\n");
      out.write("        cartItems.splice(index, 1);\r\n");
      out.write("        localStorage.setItem('cart', JSON.stringify(cartItems));\r\n");
      out.write("        loadCartItems(); // This will update UI\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function updateSubtotal() {\r\n");
      out.write("        var cartItems = JSON.parse(localStorage.getItem('cart')) || [];\r\n");
      out.write("        var subtotal = cartItems.reduce((sum, item) => {\r\n");
      out.write("            var itemPrice = parseFloat(item.price); // Convert to float\r\n");
      out.write("            var itemQuantity = parseInt(item.quantity); // Convert to integer\r\n");
      out.write("            return sum + (itemPrice * itemQuantity);\r\n");
      out.write("        }, 0);\r\n");
      out.write("        document.getElementById('subtotal').textContent = subtotal.toFixed(2);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function checkout() {\r\n");
      out.write("        alert('Proceed to checkout...');\r\n");
      out.write("        // Placeholder for actual checkout process\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    document.addEventListener('DOMContentLoaded', loadCartItems);\r\n");
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
