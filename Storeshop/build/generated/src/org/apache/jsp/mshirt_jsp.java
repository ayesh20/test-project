package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mshirt_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang = \"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Hotel Online Reservation</title>\n");
      out.write("\t\t<meta charset = \"utf-8\" />\n");
      out.write("\t\t<meta name = \"viewport\" content = \"width=device-width, initial-scale=1.0\" />\n");
      out.write("\t\t<link rel = \"stylesheet\" type = \"text/css\" href = \"css/bootstrap.css \" />\n");
      out.write("\t\t<link rel = \"stylesheet\" type = \"text/css\" href = \"style.css\" />\n");
      out.write("<!--=============== REMIXICONS ===============-->\n");
      out.write("      <link href=\"https://cdn.jsdelivr.net/npm/remixicon@3.2.0/fonts/remixicon.css\" rel=\"stylesheet\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\" integrity=\"sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/fav.png\">  \n");
      out.write("\t</head>\n");
      out.write("<body  >\n");
      out.write("\t\n");
      out.write("     \n");
      out.write("\n");
      out.write("      <!--=============== HEADER ===============-->\n");
      out.write("     <header class=\"header\" >\n");
      out.write("         <nav class=\"nav container\">\n");
      out.write("            <div class=\"nav__data\">\n");
      out.write("               <a href=\"#\" class=\"nav__logo\">\n");
      out.write("                 \n");
      out.write("          <div class=\"logo\">\n");
      out.write("          <img src=\"images/Thai12.png\">\n");
      out.write("          </div>\n");
      out.write("                  \n");
      out.write("               </a>\n");
      out.write("               \n");
      out.write("               <div class=\"nav__toggle\" id=\"nav-toggle\">\n");
      out.write("                  <i class=\"ri-menu-line nav__burger\"></i>\n");
      out.write("                  <i class=\"ri-close-line nav__close\"></i>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--=============== NAV MENU ===============-->\n");
      out.write("            <div class=\"nav__menu\" id=\"nav-menu\">\n");
      out.write("               <ul class=\"nav__list\">\n");
      out.write("                  <li><a href=\"index.jsp\" class=\"nav__link\">Home</a></li>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("\n");
      out.write("                  <!--=============== DROPDOWN 2 ===============-->\n");
      out.write("                  <li class=\"dropdown__item\">\n");
      out.write("                     <div class=\"nav__link\">\n");
      out.write("                       Mens<i class=\"ri-arrow-down-s-line dropdown__arrow\"></i>\n");
      out.write("                     </div>\n");
      out.write("\n");
      out.write("                     <ul class=\"dropdown__menu\">\n");
      out.write("                        \n");
      out.write("                        <li>\n");
      out.write("                           <a href=\"mshirt.jsp\" class=\"dropdown__link\">\n");
      out.write("                              Shirts \n");
      out.write("                           </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                           <a href=\"mtrouser.jsp\" class=\"dropdown__link\">\n");
      out.write("                              Trousers\n");
      out.write("                           </a>\n");
      out.write("                        </li>\n");
      out.write("                         <li>\n");
      out.write("                           <a href=\"shorts.jsp\" class=\"dropdown__link\">\n");
      out.write("                              Shorts\n");
      out.write("                           </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                           <a href=\"manother.jsp\" class=\"dropdown__link\">\n");
      out.write("                              Others\n");
      out.write("                           </a>\n");
      out.write("                        </li>\n");
      out.write("                     </ul>\n");
      out.write("                  </li>\n");
      out.write("              <li><a href=\"gallery.jsp\" class=\"nav__link\">Gallery</a></li>\n");
      out.write("                  <li><a href=\"aboutus.jsp\" class=\"nav__link\">About us</a></li>\n");
      out.write("                  <li class=\"dropdown__item\">\n");
      out.write("                     <div class=\"nav__link\">\n");
      out.write("                         <a href=\"login.jsp\" id=\"cdn\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i>My Account</a>\n");
      out.write("</div></li>\n");
      out.write("          <li class=\"dropdown__item\">\n");
      out.write("                     <div class=\"nav__link\">\n");
      out.write("                         <a href=\"cart.jsp\" id=\"cdn\"><span class=\"totalQuantity\"  id=\"cart-count\">0</span>\n");
      out.write("  <i class=\"fa fa-cart-arrow-down\" aria-hidden=\"true\"></i>  <!-- Initial count is 0 -->My Cart\n");
      out.write("</a>\n");
      out.write("</div></li>\n");
      out.write("\n");
      out.write("                  </ul>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("         </nav>\n");
      out.write("      </header>\n");
      out.write("\n");
      out.write("     <br><br><br>\n");
      out.write("      <footer>\n");
      out.write("         <div class=\"container6\">\n");
      out.write("             <div class=\"row6\">\n");
      out.write("                   <div class=\"col6\" id=\"company\">\n");
      out.write("                      \n");
      out.write("                       <p>\n");
      out.write("                         We are specialized in designings, make your business a brand.\n");
      out.write("                         Try our premium services.\n");
      out.write("                       </p>\n");
      out.write("                       <div class=\"social6\">\n");
      out.write("                         <a href=\"#\"><i class=\"fab fa-facebook\"></i></a>\n");
      out.write("                         <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                         <a href=\"#\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("                         <a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                         <a href=\"#\"><i class=\"fab fa-linkedin\"></i></a>\n");
      out.write("                       </div>\n");
      out.write("                   </div>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("                   <div class=\"col6\" id=\"services\">\n");
      out.write("                      <h3>Favourite</h3>\n");
      out.write("                      <div class=\"links\">\n");
      out.write("                         <a href=\"mtrouser.jsp\">Man Trousers</a>\n");
      out.write("                         <a href=\"mshirt.jsp\">Shirts</a>\n");
      out.write("                         <a href=\"gallery.jsp\">gallery</a>\n");
      out.write("                         <a href=\"shorts.jsp\">Shorts</a>\n");
      out.write("                      </div>\n");
      out.write("                   </div>\n");
      out.write(" \n");
      out.write("                   <div class=\"col6\" id=\"useful-links\">\n");
      out.write("                      <h3>Links</h3>\n");
      out.write("                      <div class=\"links\">\n");
      out.write("                         <a href=\"aboutus.jsp\">About</a>\n");
      out.write("                         <a href=\"#\">Men</a>\n");
      out.write("                         <a href=\"manother.jsp\">others</a>\n");
      out.write("                      </div>\n");
      out.write("                   </div>\n");
      out.write(" \n");
      out.write("                   <div class=\"col6\" id=\"contact\">\n");
      out.write("                       <h3>Contact</h3>\n");
      out.write("                       <div class=\"contact-details\">\n");
      out.write("                          <i class=\"fa fa-location\"></i>\n");
      out.write("                          <p>FF-42, Procube Avenue, <br> NY, USA</p>\n");
      out.write("                       </div>\n");
      out.write("                       <div class=\"contact-details\">\n");
      out.write("                          <i class=\"fa fa-phone\"></i>\n");
      out.write("                          <p>+1-8755856858</p>\n");
      out.write("                       </div>\n");
      out.write("                   </div>\n");
      out.write("             </div>\n");
      out.write("             <br><br><br><br>\n");
      out.write("             \n");
      out.write(" <div class=\"col6\" >\n");
      out.write("                <div class=\"col61\">      \n");
      out.write("                    <font size=\"4.3rem\" > All Right Received.</font>\n");
      out.write("                </div>\n");
      out.write("                   </div>\n");
      out.write("             \n");
      out.write(" \n");
      out.write("         </div>\n");
      out.write("      </footer> \n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("      <!--=============== MAIN JS ===============-->\n");
      out.write("      <script src=\"js/main.js\"></script>\n");
      out.write("      <script src=\"js/main1.js\"></script>\n");
      out.write("</body>\n");
      out.write("<script src = \"js/jquery.js\"></script>\n");
      out.write("<script src = \"js/bootstrap.js\"></script>\t\n");
      out.write("</html>\n");
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
