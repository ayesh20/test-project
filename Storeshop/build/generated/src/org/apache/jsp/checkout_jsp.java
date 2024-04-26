package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    \n");
      out.write("    <!-- custom css file link  -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container_checkout\">\n");
      out.write("\n");
      out.write("    <form action=\"\">\n");
      out.write("\n");
      out.write("        <div class=\"row_checkout\">\n");
      out.write("\n");
      out.write("<!--Customer Details-->\n");
      out.write("\n");
      out.write("            <div class=\"col_checkout\">\n");
      out.write("\n");
      out.write("                <h3 class=\"title_checkout\">billing address</h3>\n");
      out.write("\n");
      out.write("                <div class=\"inputBox_checkout\">\n");
      out.write("                    <span>full name :</span>\n");
      out.write("                    <input type=\"text\" placeholder=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputBox_checkout\">\n");
      out.write("                    <span>email :</span>\n");
      out.write("                    <input type=\"email\" placeholder=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputBox_checkout\">\n");
      out.write("                    <span>address :</span>\n");
      out.write("                    <input type=\"text\" placeholder=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputBox_checkout\">\n");
      out.write("                    <span>city :</span>\n");
      out.write("                    <input type=\"text\" placeholder=\"\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"flex_checkout\">\n");
      out.write("                    <div class=\"inputBox_checkout\">\n");
      out.write("                        <span>District :</span>\n");
      out.write("                        <input type=\"text\" placeholder=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"inputBox_checkout\">\n");
      out.write("                        <span>zip code :</span>\n");
      out.write("                        <input type=\"text\" placeholder=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("<!--Payment col. section-->\n");
      out.write("            <div class=\"col_checkout\">\n");
      out.write("\n");
      out.write("                <h3 class=\"title_checkout\">payment</h3>\n");
      out.write("\n");
      out.write("                <div class=\"inputBox_checkout\">\n");
      out.write("                    <span>cards accepted :</span>\n");
      out.write("                    <img src=\"card_img.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputBox_checkout\">\n");
      out.write("                    <span>name on card :</span>\n");
      out.write("                    <input type=\"text\" placeholder=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputBox_checkout\">\n");
      out.write("                    <span>credit card number :</span>\n");
      out.write("                    <input type=\"number\" placeholder=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputBox_checkout\">\n");
      out.write("                    <span>exp month :</span>\n");
      out.write("                    <input type=\"text\" placeholder=\"\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"flex_checkout\">\n");
      out.write("                    <div class=\"inputBox_checkout\">\n");
      out.write("                        <span>exp year :</span>\n");
      out.write("                        <input type=\"number\" placeholder=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"inputBox_checkout\">\n");
      out.write("                        <span>CVV :</span>\n");
      out.write("                        <input type=\"text\" placeholder=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <input type=\"submit\" value=\"proceed to checkout\" class=\"submit-btnch\">\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("</div>    \n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>");
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
