package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                 <li><a href=\"mshirt.jsp\" class=\"nav__link\">Shirts</a></li>\r\n");
      out.write("                 <li><a href=\"t-shirts.jsp\" class=\"nav__link\">T-Shirts</a></li>\r\n");
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
      out.write("      <br>\r\n");
      out.write("      <div class=\"main-container\">\r\n");
      out.write("          \r\n");
      out.write("    <div class=\"hero-section\">\r\n");
      out.write("        <div class=\"hero-image-container\">\r\n");
      out.write("          \r\n");
      out.write("            <img src=\"images/1115.jpg\" alt=\"Featured Image 1\" class=\"side-image\">\r\n");
      out.write("            <div class=\"hero-text\">\r\n");
      out.write("            <h1>PRINTED PLAYBOOK</h1>\r\n");
      out.write("            <p>Make your business a brand. Make your business a brand.</p><br>\r\n");
      out.write("            <button class=\"shop-now-btn\"><a href=\"login.jsp\"> SHOP NOW</a></button>\r\n");
      out.write("        </div>\r\n");
      out.write("            <img src=\"images/1114.jpg\" alt=\"Featured Image 2\" class=\"side-image\">\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("          \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("           <div class=\"categories-title\">select item</div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"categories-section\">\r\n");
      out.write("        <div class=\"category-image-container\">\r\n");
      out.write("            <div class=\"effect-img\">\r\n");
      out.write("            <a href=\"idex.jsp\" id=\"main\"><img src=\"images/1114.jpg\" alt=\"Category Image 3\" class=\"category-image\">\r\n");
      out.write("            <div class=\"inner\">\r\n");
      out.write("                <h2>SHIRTS</h2>\r\n");
      out.write("                        </div></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        <div class=\"category-image-container\">\r\n");
      out.write("            <div class=\"effect-img\">\r\n");
      out.write("            <a href=\"idex.jsp\" id=\"main\"><img src=\"images/1114.jpg\" alt=\"Category Image 3\" class=\"category-image\">\r\n");
      out.write("            <div class=\"inner\">\r\n");
      out.write("                <h2>TROUSERS</h2>\r\n");
      out.write("            </div></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"category-image-container\">\r\n");
      out.write("            <div class=\"effect-img\">\r\n");
      out.write("            <a href=\"idex.jsp\" id=\"main\"><img src=\"images/1114.jpg\" alt=\"Category Image 3\" class=\"category-image\">\r\n");
      out.write("            <div class=\"inner\">\r\n");
      out.write("                <h2>T-SHIRTS</h2>\r\n");
      out.write("            </div></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"category-image-container\">\r\n");
      out.write("            <div class=\"effect-img\">\r\n");
      out.write("            <a href=\"idex.jsp\" id=\"main\"><img src=\"images/1114.jpg\" alt=\"Category Image 3\" class=\"category-image\">\r\n");
      out.write("            <div class=\"inner\">\r\n");
      out.write("                <h2>SHORTS</h2>\r\n");
      out.write("            </div></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("    <div class=\"header12\">\r\n");
      out.write("    <h1>OUR PHILOSOPHY</h1>\r\n");
      out.write("    <div class=\"underline\"></div>\r\n");
      out.write("    <div class=\"section-container\">\r\n");
      out.write("  <!-- Section 1 -->\r\n");
      out.write("  <div class=\"section\">\r\n");
      out.write("    <img src=\"images/1113.jpg\" alt=\"Hybrid and Inventive Collection\">\r\n");
      out.write("    <div class=\"section-text\">\r\n");
      out.write("      <div class=\"section-title\">HYBRID AND INVENTIVE</div>\r\n");
      out.write("      <div class=\"section-description\">\r\n");
      out.write("        LCY set out on an ardent journey of fashion, innovation and entrepreneurship to highlight diverse facets and shades of everyday life.\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Section 2 -->\r\n");
      out.write("  <div class=\"section\">\r\n");
      out.write("    <img src=\"images/1113.jpg\" alt=\"Finer Weave Collection\">\r\n");
      out.write("    <div class=\"section-text\">\r\n");
      out.write("      <div class=\"section-title\">FINER WEAVE</div>\r\n");
      out.write("      <div class=\"section-description\">\r\n");
      out.write("        Designed to stand out with cultivated flair, our collections are for the suave individuals with refined tastes.\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Section 3 -->\r\n");
      out.write("  <div class=\"section\">\r\n");
      out.write("    <img src=\"images/1113.jpg\" alt=\"A Magesterial Essential for All Wardrobes\">\r\n");
      out.write("    <div class=\"section-text\">\r\n");
      out.write("      <div class=\"section-title\">A MAGISTERIAL ESSENTIAL FOR ALL WARDROBES</div>\r\n");
      out.write("      <div class=\"section-description\">\r\n");
      out.write("        Our collection enables you to walk the runway of everyday life with a smart style and vibrant tones that blend in with timeless splendour.\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
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
      out.write("                         <a href=\"t-shirts.jsp\">T-shirts</a>\r\n");
      out.write("                         <a href=\"mshirt.jsp\">Shirts</a>\r\n");
      out.write("                         <a href=\"gallery.jsp\">gallery</a>\r\n");
      out.write("                         <a href=\"shorts.jsp\">Shorts</a>\r\n");
      out.write("                      </div>\r\n");
      out.write("                   </div>\r\n");
      out.write(" \r\n");
      out.write("                   <div class=\"col6\" id=\"useful-links\">\r\n");
      out.write("                      <h3>Links</h3>\r\n");
      out.write("                      <div class=\"links\">\r\n");
      out.write("                         <a href=\"aboutus.jsp\">About</a>\r\n");
      out.write("                         <a href=\"#\">Men</a>\r\n");
      out.write("                         <a href=\"manother.jsp\">others</a>\r\n");
      out.write("                      </div>\r\n");
      out.write("                   </div>\r\n");
      out.write(" \r\n");
      out.write("                   <div class=\"col6\" id=\"contact\">\r\n");
      out.write("                       <h3>Contact</h3>\r\n");
      out.write("                       <div class=\"links\"><a href=\"contact us.jsp\">For Any Inquiry</a></div>\r\n");
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
      out.write("<script>\r\n");
      out.write("         function showSelectButton(cardElement) {\r\n");
      out.write("            cardElement.getElementsByClassName('select-button')[0].style.display = 'block';\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function hideSelectButton(cardElement) {\r\n");
      out.write("            cardElement.getElementsByClassName('select-button')[0].style.display = 'none';\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function showProductDetails(cardElement) {\r\n");
      out.write("            var title = cardElement.getAttribute('data-title');\r\n");
      out.write("            var price = cardElement.getAttribute('data-price');\r\n");
      out.write("            var image = cardElement.getAttribute('data-image');\r\n");
      out.write("\r\n");
      out.write("            var modalTitle = document.querySelector('.modal-details .modal-title');\r\n");
      out.write("            var modalPrice = document.querySelector('.modal-details .modal-price');\r\n");
      out.write("            var modalImage = document.querySelector('.modal-images .main-image');\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            modalTitle.textContent = title;\r\n");
      out.write("            modalPrice.textContent = price;\r\n");
      out.write("            modalImage.src = image;\r\n");
      out.write("\r\n");
      out.write("            document.getElementById('productDetailsModal').style.display = 'block';\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function hideProductDetails() {\r\n");
      out.write("            document.getElementById('productDetailsModal').style.display = 'none';\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // Global variables to keep track of the selected product details\r\n");
      out.write("        var selectedColor = '';\r\n");
      out.write("        var selectedSize = '';\r\n");
      out.write("        var selectedProduct;\r\n");
      out.write("\r\n");
      out.write("        function selectColor(color) {\r\n");
      out.write("            selectedColor = color;\r\n");
      out.write("            var buttons = document.querySelectorAll('.color-options button');\r\n");
      out.write("    buttons.forEach(function(btn) {\r\n");
      out.write("        btn.classList.remove('selected');\r\n");
      out.write("    });\r\n");
      out.write("    document.querySelector('.color-' + color).classList.add('selected');\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function selectSize(size) {\r\n");
      out.write("            selectedSize = size;\r\n");
      out.write("            var buttons = document.querySelectorAll('.size-options button');\r\n");
      out.write("    buttons.forEach(function(btn) {\r\n");
      out.write("        btn.classList.remove('selected');\r\n");
      out.write("    });\r\n");
      out.write("    Array.from(buttons).find(btn => btn.textContent === size).classList.add('selected');\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function addToCart() {\r\n");
      out.write("            var quantity = document.getElementById('quantity').value;\r\n");
      out.write("            var productDetails = {\r\n");
      out.write("                id: selectedProduct.getAttribute('data-id'),\r\n");
      out.write("                title: selectedProduct.getAttribute('data-title'),\r\n");
      out.write("                price: selectedProduct.getAttribute('data-price'),\r\n");
      out.write("                image: selectedProduct.querySelector('img').src,\r\n");
      out.write("                color: selectedColor,\r\n");
      out.write("                size: selectedSize,\r\n");
      out.write("                quantity: quantity\r\n");
      out.write("            };\r\n");
      out.write("\r\n");
      out.write("            var cart = JSON.parse(localStorage.getItem('cart') || '[]');\r\n");
      out.write("            cart.push(productDetails);\r\n");
      out.write("            localStorage.setItem('cart', JSON.stringify(cart));\r\n");
      out.write("\r\n");
      out.write("            updateCartCount();\r\n");
      out.write("            hideProductDetails();\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function showProductDetails(cardElement) {\r\n");
      out.write("            selectedProduct = cardElement; // Store reference to the selected product card\r\n");
      out.write("            document.getElementById('modalTitle').textContent = cardElement.getAttribute('data-title');\r\n");
      out.write("            document.getElementById('modalPrice').textContent = cardElement.getAttribute('data-price');\r\n");
      out.write("             document.getElementById('modalImage').textContent = `$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cardElement.getAttribute('data-image')}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("`;\r\n");
      out.write("            // Reset color and size selections\r\n");
      out.write("            selectedColor = '';\r\n");
      out.write("            selectedSize = '';\r\n");
      out.write("            document.getElementById('productDetailsModal').style.display = 'block';\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function updateCartCount() {\r\n");
      out.write("            var cartCountElement = document.getElementById('cart-count');\r\n");
      out.write("            var cart = JSON.parse(localStorage.getItem('cart') || '[]');\r\n");
      out.write("            var totalCount = cart.reduce((total, item) => total + parseInt(item.quantity), 0);\r\n");
      out.write("            cartCountElement.innerText = totalCount;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        document.addEventListener('DOMContentLoaded', function() {\r\n");
      out.write("            updateCartCount(); // Update the cart count when the page loads\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("       \r\n");
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
