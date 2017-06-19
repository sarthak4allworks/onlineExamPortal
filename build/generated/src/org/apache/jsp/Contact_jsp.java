package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Contact Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/contact_us.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("       <div id=\"header\">\n");
      out.write("            <div id=\"logo\"><a href=\"homePage.html\"><img src=\"image/logo.png\" alt=\"Logo.jpg\" height=\"auto\"></a></div>\n");
      out.write("            <div id=\"heading\"><h1 id=\"head\">ONLINE EXAM PORTAL</h1></div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("       <div id=\"menu\">\n");
      out.write("        <ul id=\"UL\">\n");
      out.write("            <li class=\"LI\"><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("            <li class=\"LI\"><a href=\"adminLogin.jsp\">ADMIN</a></li>\n");
      out.write("            <li class=\"LI\"><a href=\"userLogIN.jsp\">USER</a></li>\n");
      out.write("            <li class=\"LI\"><a href=\"new_user_register.jsp\">NEW USER</a></li>\n");
      out.write("            <li class=\"LI\"><a href=\"Contact.jsp\">CONACT US</a></li>\n");
      out.write("        </ul>\n");
      out.write("        </div>\n");
      out.write("        <br><br>\n");
      out.write("    \t<div class=\"middle\">\n");
      out.write("        <center>\n");
      out.write("        <table class=\"t1\">\n");
      out.write("\t<tr><td></td><td><font id=\"one\"><u>Contact Here</u></font></td></tr>\n");
      out.write("          <tr><td></td></tr>\n");
      out.write("           <tr>\n");
      out.write("           <td><font class=\"one1\">Name:</font></td>\n");
      out.write("           <td><font class=\"one1\">Sarthak Agarwal</font></td>\n");
      out.write("           </tr>\n");
      out.write("           \n");
      out.write("           <tr>\n");
      out.write("           <td><font class=\"one1\">Email:</font></td>\n");
      out.write("           <td><font class=\"one1\">sarthak.1413088@kiet.edu</font></td>\n");
      out.write("           </tr>\n");
      out.write("           \n");
      out.write("           <tr>\n");
      out.write("           <td><font class=\"one1\">Telephone:</font></td>\n");
      out.write("           <td><font class=\"one1\">8791905580</font></td>\n");
      out.write("           </tr>\n");
      out.write("           \n");
      out.write("           <tr>\n");
      out.write("           <td><font class=\"one1\">Branch:</font></td>\n");
      out.write("           <td><font class=\"one1\">IT</font></td>\n");
      out.write("           </tr>\n");
      out.write("      <tr><td></td></tr>\n");
      out.write("           <tr>\n");
      out.write("           <td><font class=\"one1\">Name:</font></td>\n");
      out.write("           <td><font class=\"one1\">Sushmita Gupta</font></td>\n");
      out.write("           </tr>\n");
      out.write("           \n");
      out.write("           <tr>\n");
      out.write("           <td><font class=\"one1\">Email:</font></td>\n");
      out.write("           <td><font class=\"one1\">sushmita.1413111@kiet.edu</font></td>\n");
      out.write("           </tr>\n");
      out.write("           \n");
      out.write("           <tr>\n");
      out.write("           <td><font class=\"one1\">Telephone</font></td>\n");
      out.write("           <td><font class=\"one1\">9917070524</font></td>\n");
      out.write("           </tr>\n");
      out.write("           \n");
      out.write("           <tr>\n");
      out.write("           <td><font class=\"one1\">Branch:</font></td>\n");
      out.write("           <td><font class=\"one1\">IT</font></td>\n");
      out.write("           </tr>\n");
      out.write("           \n");
      out.write("         </table>\n");
      out.write("\t</center></div>\n");
      out.write("\t<br><br>\n");
      out.write("    <hr>\n");
      out.write("    <div id=\"footer\">\n");
      out.write("        <div id=\"footerl\">\n");
      out.write("            <center>\n");
      out.write("                <a href=\"#\"><img src=\"image/faq.png\" alt=\"Faq's\"></a>\n");
      out.write("            </center>\n");
      out.write("            <br>\n");
      out.write("            <center><font class=\"one\"><strong>FAQs</strong></font></center>\n");
      out.write("            <hr><br>\n");
      out.write("            <font class=\"two\">What about the test</font>\n");
      out.write("            <br><br>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"footerm\">\n");
      out.write("            <center>\n");
      out.write("                <a href=\"#\"><img src=\"image/phone-book.png\" alt=\"Contacts\"></a>\n");
      out.write("            </center>\n");
      out.write("            <br>\n");
      out.write("            <center><font class=\"one\"><strong>Contact Info</strong></font></center>\n");
      out.write("            <hr><br>\n");
      out.write("            <font class=\"two\">Contact: 8791905580</font>\n");
      out.write("            <br><br>\n");
      out.write("            <font class=\"two\">Email id: sarthak.1413088@kiet.edu</font>\n");
      out.write("            <br>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"footerr\">\n");
      out.write("             <center>\n");
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
      out.write("        </center>\n");
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
