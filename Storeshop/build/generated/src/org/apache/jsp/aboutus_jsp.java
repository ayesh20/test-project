package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            \r\n");
      out.write("            <style>\r\n");
      out.write("   .about-section {\r\n");
      out.write("    padding: 100px 0;\r\n");
      out.write("    background-color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".about-image-container {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    border-radius: 8px;\r\n");
      out.write("    box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".about-image {\r\n");
      out.write("    max-width: 100%;\r\n");
      out.write("    height: auto;\r\n");
      out.write("    transition: transform 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".about-image-container:hover .about-image {\r\n");
      out.write("    transform: scale(1.1);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".about-content {\r\n");
      out.write("    padding-left: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".about-heading {\r\n");
      out.write("    font-size: 36px;\r\n");
      out.write("    font-weight: 700;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("    color: #4BD2DB;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    letter-spacing: 2px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".about-text {\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    line-height: 1.6;\r\n");
      out.write("    color: #666;\r\n");
      out.write("    margin-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".about-quote {\r\n");
      out.write("    margin-bottom: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".about-quote blockquote {\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    font-style: italic;\r\n");
      out.write("    color: #333;\r\n");
      out.write("    border-left: 3px solid #4BD2DB;\r\n");
      out.write("    padding-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".about-btn {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    padding: 12px 30px;\r\n");
      out.write("    background-color: #4BD2DB;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-weight: 600;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    border-radius: 30px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    transition: background-color 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".about-btn:hover {\r\n");
      out.write("    background-color: whitesmoke;\r\n");
      out.write("}  \r\n");
      out.write(" body {\r\n");
      out.write("     \r\n");
      out.write("      justify-content: center;\r\n");
      out.write("      align-items: center;\r\n");
      out.write("      min-height: 100vh;\r\n");
      out.write("      margin: 199px;\r\n");
      out.write("      padding: 0;\r\n");
      out.write("      \r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .about-section {\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      /* Additional styles for .about-section */\r\n");
      out.write("    }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("\t\t<title>about us-FUNKYBOYZ</title>\r\n");
      out.write("\t\t<meta charset = \"utf-8\" />\r\n");
      out.write("\t\t<meta name = \"viewport\" content = \"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("\t\t<link rel = \"stylesheet\" type = \"text/css\" href = \"css/bootstrap.css \" />\r\n");
      out.write("\t\t<link rel = \"stylesheet\" type = \"text/css\" href = \"style.css\" />\r\n");
      out.write("<!--=============== REMIXICONS ===============-->\r\n");
      out.write("      <link href=\"https://cdn.jsdelivr.net/npm/remixicon@3.2.0/fonts/remixicon.css\" rel=\"stylesheet\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\" integrity=\"sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/fav.png\">  \r\n");
      out.write("\t</head>\r\n");
      out.write("        <body align ><br>\r\n");
      out.write("<center><div class=\"logo\">\r\n");
      out.write("          <img src=\"images/logo1.png\">\r\n");
      out.write("    </div></center>\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("      <!--=============== HEADER ===============-->\r\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/navBar.jsp", out, false);
      out.write("\r\n");
      out.write("      \r\n");
      out.write("     <section class=\"about-section\">\r\n");
      out.write("      <section class=\"about-section\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-6 order-md-2\">\r\n");
      out.write("                <div class=\"about-image-container\">\r\n");
      out.write("                    <img src=\"images/about.png\" alt=\"About Image\" class=\"about-image\">\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6 order-md-1\">\r\n");
      out.write("                <div class=\"about-content\">\r\n");
      out.write("                    <h2 class=\"about-heading\">About FunkyBoyz</h2>\r\n");
      out.write("                    <p class=\"about-text\">At FunkyBoyz, we're all about embracing the new generation of style. From bold prints to cutting-edge designs, our clothing reflects the vibrant energy and individuality of today's fashion-forward youth.</p>\r\n");
      out.write("                    <p class=\"about-text\">Founded with a passion for creativity and innovation, FunkyBoyz is committed to providing high-quality, on-trend apparel that allows you to express yourself with confidence.</p>\r\n");
      out.write("                    <div class=\"about-quote\">\r\n");
      out.write("                        <blockquote>\r\n");
      out.write("                            <p>\"Join us on this fashion journey and unleash your unique style with FunkyBoyz Clothing Company!\"</p>\r\n");
      out.write("                        </blockquote>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"#\" class=\"about-btn\">Shop Now</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("         </section>\r\n");
      out.write("      \r\n");
      out.write("       \r\n");
      out.write("      \r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      <!--=============== MAIN JS ===============-->\r\n");
      out.write("      <script src=\"js/main.js\"></script>\r\n");
      out.write("      <script src=\"js/main1.js\"></script>\r\n");
      out.write("\r\n");
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
