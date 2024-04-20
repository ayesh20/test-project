package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class additem_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Add New Item</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"admin.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"dashboard\">\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("            <div class=\"menu\">\n");
      out.write("                <div class=\"menu-item\">DASHBOARD</div>\n");
      out.write("                <div class=\"menu-item \">Add item</div>\n");
      out.write("                <div class=\"menu-item\">users</div>\n");
      out.write("                <div class=\"menu-item\">Categories</div>\n");
      out.write("                <div class=\"menu-item\">Orders</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <input type=\"search\" placeholder=\"Search\" class=\"search-input\">\n");
      out.write("                <span class=\"admin\">Administrator</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"add-item-panel\">\n");
      out.write("                <h1>Add a New Item</h1>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" id=\"name\" placeholder=\"Name\">\n");
      out.write("                    <input type=\"text\" id=\"price\" placeholder=\"Price\">\n");
      out.write("                    <input type=\"number\" id=\"quantity\" placeholder=\"Quantity\">\n");
      out.write("                    <input type=\"text\" id=\"category\" placeholder=\"Category\">\n");
      out.write("                    <div class=\"file-upload\">\n");
      out.write("                        <input type=\"file\" id=\"image\">\n");
      out.write("                        <span class=\"file-label\">Choose file</span>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\">Add item</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
