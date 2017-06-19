package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class afterUserLogIn_005f1st_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"errorPage.jsp", true, 8192, true);
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
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>1St Year Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/afterUserLogIN.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"logo\"><a href=\"homePage.html\"><img src=\"image/logo.png\" alt=\"Logo.jpg\" height=\"auto\"></a></div>\n");
      out.write("            <div id=\"heading\"><h1 id=\"head\">ONLINE EXAM PORTAL</h1></div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div id=\"menu-header\">\n");
      out.write("        <div class=\"menu-wrap\">\n");
      out.write("        <nav class=\"menu\">\n");
      out.write("        <ul class=\"clearfix\">\n");
      out.write("            <li><a href=\"#\">HOME</a></li>\n");
      out.write("            <li><a href=\"#\">TECHNICAL<span class=\"arrow\">&#9660;</span></a>\n");
      out.write("                <ul class=\"sub-menu\">\n");
      out.write("                     <li><a href=\"#\"><center>C</center></a></li>\n");
      out.write("                     <li><a href=\"#\"><center>Electrical</center></a></li>\n");
      out.write("                     <li><a href=\"#\"><center>Electronics</center></a></li>\n");
      out.write("                     <li><a href=\"#\"><center>Chemistry</center></a></li>\n");
      out.write("                     <li><a href=\"#\"><center>Physics 1st</center></a></li>\n");
      out.write("                     <li><a href=\"#\"><center>Physics 2nd</center></a></li>\n");
      out.write("                     <li><a href=\"#\"><center>Mechanics</center></a></li>\n");
      out.write("                     <li><a href=\"#\"><center>Manufacturing Process</center></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("            <a href=\"#\">REPORT</a>\n");
      out.write("            </li>\n");
      out.write("           <li>\n");
      out.write("               <a href=\"#\">KEY PAPER WITH SOLUTIONS<span class=\"arrow\">&#9660;</span></a>\n");
      out.write("               <ul class=\"sub-menu\">\n");
      out.write("                     <li><a href=\"#\"><center>C</center></a></li>\n");
      out.write("                     <li><a href=\"#\"><center>Electrical</center></a></li>\n");
      out.write("                     <li><a href=\"#\"><center>Electronics</center></a></li>\n");
      out.write("                     <li><a href=\"#\"><center>Chemistry</center></a></li>\n");
      out.write("                     <li><a href=\"#\"><center>Physics 1st</center></a></li>\n");
      out.write("                     <li><a href=\"#\"><center>Physics 2nd</center></a></li>\n");
      out.write("                     <li><a href=\"#\"><center>Mechanics</center></a></li>\n");
      out.write("                     <li><a href=\"#\"><center>Manufacturing Process</center></a></li>\n");
      out.write("               </ul>\n");
      out.write("           </li>\n");
      out.write("           <li><a href=\"#\">SIGN OUT</a></li>\n");
      out.write("            </ul>\n");
      out.write("            </nav>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("            <br><br>\n");
      out.write("            <div id=\"middle\"><center>\n");
      out.write("            <a href=\"homePage.html\">\n");
      out.write("            <div class=\"slider-holder\">\n");
      out.write("            <span id=\"slider-image-1\"></span>\n");
      out.write("            <span id=\"slider-image-2\"></span>\n");
      out.write("            <span id=\"slider-image-3\"></span>\n");
      out.write("            <div class=\"image-holder\">\n");
      out.write("                 <img src=\"image/exam 2.jpg\" class=\"slider-image\" height=\"400px\" width=\"800px\"/>\n");
      out.write("                            <img src=\"image/exam 1.jpg\" class=\"slider-image\" height=\"400px\" width=800px\"/>\n");
      out.write("                <img src=\"image/5.jpg\" class=\"slider-image\" height=\"400px\" width=\"800px\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"button-holder\">\n");
      out.write("                <a href=\"#slider-image-1\" class=\"slider-change\"></a>\n");
      out.write("                <a href=\"#slider-image-2\" class=\"slider-change\"></a>\n");
      out.write("                <a href=\"#slider-image-3\" class=\"slider-change\"></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </a>\n");
      out.write("        </center>\n");
      out.write("        </div>\n");
      out.write("        <br><br>\n");
      out.write("        <hr>\n");
      out.write("        <div id=\"footer\">\n");
      out.write("             <div id=\"footerl\">\n");
      out.write("                <center>\n");
      out.write("                    <a href=\"#\"><img src=\"image/faq.png\" alt=\"Faq's\"></a>\n");
      out.write("                </center>\n");
      out.write("                <br>\n");
      out.write("                <center><font class=\"one\"><strong>FAQs</strong></font></center>\n");
      out.write("                <hr><br>\n");
      out.write("                <font class=\"two\">What about the test</font>\n");
      out.write("                <br><br>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"footerm\">\n");
      out.write("                <center>\n");
      out.write("                    <a href=\"#\"><img src=\"image/phone-book.png\" alt=\"Contacts\"></a>\n");
      out.write("                </center>\n");
      out.write("                <br>\n");
      out.write("                <center><font class=\"one\"><strong>CONTACT INFO</strong></font></center>\n");
      out.write("                <hr><br>\n");
      out.write("                <font class=\"two\">Contact: 8791905580</font>\n");
      out.write("                <br>\n");
      out.write("                <font class=\"two\">Contact: 9917080524</font>\n");
      out.write("                <br><br>\n");
      out.write("                <font class=\"two\">Email id: sarthak.1413088@kiet.edu</font>\n");
      out.write("                <br>\n");
      out.write("                <font class=\"two\">Email id: sushmita.1413111@kiet.edu</font>\n");
      out.write("                <br>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"footerr\">\n");
      out.write("                <center>\n");
      out.write("                    <a href=\"#\"><img src=\"image/speech-bubble.png\" alt=\"Likes\" id=\"fr1\"></a>\n");
      out.write("                </center>\n");
      out.write("                <br>\n");
      out.write("                <center><font class=\"one\"><strong>STAY TUNED</strong></font></center>\n");
      out.write("                <hr><br>\n");
      out.write("                <font class=\"two\">For Daily News About Test , be sure to like the social pages</font>\n");
      out.write("                <br><br><center>\n");
      out.write("                    <a href=\"https://www.facebook.com\"><img src=\"image/facebook.png\" alt=\"Facebook\" class=\"fr\"></a>\n");
      out.write("                    <a href=\"https://www.google.co.in\"><img src=\"image/google-chrome.png\" alt=\"Google\" class=\"fr\"></a>\n");
      out.write("                    <a href=\"https://www.linked.com\"><img src=\"image/linkedin (1).png\" alt=\"LinkedIn\" class=\"fr\"></a>\n");
      out.write("                    <a href=\"https://twitter.com\"><img src=\"image/twitter.png\" alt=\"Twitter\" class=\"fr\"></a>\n");
      out.write("                    <a href=\"https://www.gmail.com\"><img src=\"image/gmail.png\" alt=\"Gmail\" class=\"fr\"></a>\n");
      out.write("                </center>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
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
