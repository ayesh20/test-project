package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<title>gallery-FUNKYBOYZ</title>\r\n");
      out.write("\t\t<meta charset = \"utf-8\" />\r\n");
      out.write("\t\t<meta name = \"viewport\" content = \"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("\t\t<link rel = \"stylesheet\" type = \"text/css\" href = \"css/bootstrap.css \" />\r\n");
      out.write("\t\t<link rel = \"stylesheet\" type = \"text/css\" href = \"style.css\" />\r\n");
      out.write("                <link rel = \"stylesheet\" type = \"text/css\" href = \"gallery.css\" />\r\n");
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
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/navBar.jsp", out, false);
      out.write("\r\n");
      out.write("        <br><br>\r\n");
      out.write("      <div class=\"container4\">\r\n");
      out.write("         CHANGE YOUR LIFESTYLE <br>\r\n");
      out.write("<h3 id=\"our\">WITH FASHION</h3>\r\n");
      out.write("</div>\r\n");
      out.write("  <br>\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("  <center>\r\n");
      out.write("<div class=\"container1\">\r\n");
      out.write("   <div class=\"row1\">\r\n");
      out.write("   <div class=\"column\">\r\n");
      out.write("       <div class=\"effect\">\r\n");
      out.write("       <div class=\"effect-img\">\r\n");
      out.write("           <img src=\"images/gallery1.jpg\">\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           </div>\r\n");
      out.write("       </div>\r\n");
      out.write("       </div>\r\n");
      out.write("        <div class=\"column\">\r\n");
      out.write("       <div class=\"effect\">\r\n");
      out.write("       <div class=\"effect-img\">\r\n");
      out.write("           <img src=\"images/gallery2.jpg\">\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           </div>\r\n");
      out.write("       </div>\r\n");
      out.write("       </div>\r\n");
      out.write("        <div class=\"column\">\r\n");
      out.write("       <div class=\"effect\">\r\n");
      out.write("       <div class=\"effect-img\">\r\n");
      out.write("           <img src=\"images/gallery3.jpg\">\r\n");
      out.write("         \r\n");
      out.write("           </div>\r\n");
      out.write("       </div>\r\n");
      out.write("       </div>\r\n");
      out.write("   </div>\r\n");
      out.write("</div>\r\n");
      out.write("      <br>\r\n");
      out.write("  <div class=\"container1\">\r\n");
      out.write("   <div class=\"row1\">\r\n");
      out.write("   <div class=\"column\">\r\n");
      out.write("       <div class=\"effect\">\r\n");
      out.write("       <div class=\"effect-img\">\r\n");
      out.write("           <img src=\"images/gallery4.jpg\">\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           </div>\r\n");
      out.write("       </div>\r\n");
      out.write("       </div>\r\n");
      out.write("        <div class=\"column\">\r\n");
      out.write("       <div class=\"effect\">\r\n");
      out.write("       <div class=\"effect-img\">\r\n");
      out.write("           <img src=\"images/gallery5.jpg\">\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           </div>\r\n");
      out.write("       </div>\r\n");
      out.write("       </div>\r\n");
      out.write("        <div class=\"column\">\r\n");
      out.write("       <div class=\"effect\">\r\n");
      out.write("       <div class=\"effect-img\">\r\n");
      out.write("           <img src=\"images/gallery6.jpg\">\r\n");
      out.write("           \r\n");
      out.write("        \r\n");
      out.write("           </div>\r\n");
      out.write("       </div>\r\n");
      out.write("       </div>\r\n");
      out.write("   </div> \r\n");
      out.write("      </div>\r\n");
      out.write("      <br>\r\n");
      out.write("<div class=\"container1\">\r\n");
      out.write("   <div class=\"row1\">\r\n");
      out.write("   <div class=\"column\">\r\n");
      out.write("       <div class=\"effect\">\r\n");
      out.write("       <div class=\"effect-img\">\r\n");
      out.write("           <img src=\"images/gallery7.jpg\">\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           </div>\r\n");
      out.write("       </div>\r\n");
      out.write("       </div>\r\n");
      out.write("        <div class=\"column\">\r\n");
      out.write("       <div class=\"effect\">\r\n");
      out.write("       <div class=\"effect-img\">\r\n");
      out.write("           <img src=\"images/gallery8.jpg\">\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           </div>\r\n");
      out.write("       </div>\r\n");
      out.write("       </div>\r\n");
      out.write("        <div class=\"column\">\r\n");
      out.write("       <div class=\"effect\">\r\n");
      out.write("       <div class=\"effect-img\">\r\n");
      out.write("           <img src=\"images/gallery9.jpg\">\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           </div>\r\n");
      out.write("       </div>\r\n");
      out.write("       </div>\r\n");
      out.write("   </div> \r\n");
      out.write("      </div>\r\n");
      out.write("      <br>\r\n");
      out.write("<div class=\"container1\">\r\n");
      out.write("   <div class=\"row1\">\r\n");
      out.write("   <div class=\"column\">\r\n");
      out.write("       <div class=\"effect\">\r\n");
      out.write("       <div class=\"effect-img\">\r\n");
      out.write("           <img src=\"images/gallery10.jpg\">\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           </div>\r\n");
      out.write("       </div>\r\n");
      out.write("       </div>\r\n");
      out.write("        <div class=\"column\">\r\n");
      out.write("       <div class=\"effect\">\r\n");
      out.write("       <div class=\"effect-img\">\r\n");
      out.write("           <img src=\"images/gallery11.jpg\">\r\n");
      out.write("           \r\n");
      out.write("           </div>\r\n");
      out.write("       </div>\r\n");
      out.write("       </div>\r\n");
      out.write("        <div class=\"column\">\r\n");
      out.write("       <div class=\"effect\">\r\n");
      out.write("       <div class=\"effect-img\">\r\n");
      out.write("           <img src=\"images/gallery12.jpg\">\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           </div>\r\n");
      out.write("       </div>\r\n");
      out.write("       </div>\r\n");
      out.write("   </div> \r\n");
      out.write("      </div>\r\n");
      out.write("</center>\r\n");
      out.write("      <br><br><br> \r\n");
      out.write("      ");
      out.write("\r\n");
      out.write("      <div class=\"container17\">\r\n");
      out.write("         <div class=\"container-fluid\">\r\n");
      out.write("           \r\n");
      out.write("        \r\n");
      out.write("                 <div class=\"slide\">\r\n");
      out.write("         \r\n");
      out.write("                     \r\n");
      out.write("                     <div class=\"item\" style=\"background-image: url(./images/gallery5.jpg);\">\r\n");
      out.write("                         \r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"item\" style=\"background-image: url(./images/gallery6.jpg);\">\r\n");
      out.write("                         \r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"item\" style=\"background-image: url(./images/gallery7.jpg);\">\r\n");
      out.write("                         \r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"item\" style=\"background-image: url(./images/gallery8.jpg);\">\r\n");
      out.write("                         \r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"item\" style=\"background-image: url(./images/gallery9.jpg);\">\r\n");
      out.write("                         \r\n");
      out.write("                     </div>\r\n");
      out.write("                     \r\n");
      out.write("                     \r\n");
      out.write("                     \r\n");
      out.write("         \r\n");
      out.write("                 </div>\r\n");
      out.write("         \r\n");
      out.write("                 <div class=\"button\">\r\n");
      out.write("                     <button class=\"prev\"><i class=\"fa-solid fa-arrow-left\"></i></button>\r\n");
      out.write("                     <button class=\"next\"><i class=\"fa-solid fa-arrow-right\"></i></button>\r\n");
      out.write("                 </div>\r\n");
      out.write("        \r\n");
      out.write("             </div>\r\n");
      out.write("             \r\n");
      out.write("             </div> \r\n");
      out.write("             <br><br> \r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/footer.jsp", out, false);
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      <!--=============== MAIN JS ===============-->\r\n");
      out.write("      <script src=\"js/main.js\"></script>\r\n");
      out.write("      <script src=\"js/main1.js\"></script>\r\n");
      out.write("      \r\n");
      out.write("          \r\n");
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
