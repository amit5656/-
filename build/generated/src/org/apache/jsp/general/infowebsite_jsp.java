package org.apache.jsp.general;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class infowebsite_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../general/menu.jsp", out, false);
      out.write("\n");
      out.write("<html> \n");
      out.write("    <head>\n");
      out.write("        <link href=\"../newcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>menu</title>\n");
      out.write("        <style>\n");
      out.write("         \n");
      out.write("            body{\n");
      out.write("                width:auto;background-size:cover;\n");
      out.write("                 background-image:url(\"../images/20508468.jpg\");\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("          \n");
      out.write("            </style>\n");
      out.write("        </head>\n");
      out.write("        <body >\n");
      out.write("          \n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("                <h1>מידע על המכונית GTR R34</h1>\n");
      out.write("               \n");
      out.write("                <video   width=\"500\" controls  autoplay>\n");
      out.write("                \n");
      out.write("                    <source src=\"../images/Y2Mate.is - Neon blade — Nissan R34 edit-98W3_sifvF8-1080p-1655530532404.mp4\" type=\"video/mp4\">\n");
      out.write("                    Your browser does not support the <code>video</code> tag.\n");
      out.write("                </video>\n");
      out.write("              \n");
      out.write("                \n");
      out.write("            </body>\n");
      out.write("        </html>\n");
      out.write("        ");
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
