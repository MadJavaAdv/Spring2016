package java112.project4;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import javax.servlet.annotation.*;

@WebServlet(name="URLRewritingServlet",
    urlPatterns = { "/URLRewritingServlet" }
)

public class URLRewritingServlet extends HttpServlet {
//Initialize global variables

 public void init(ServletConfig config)
  throws ServletException {

  super.init(config);
 }

 //Process the HTTP Get request
 public void doGet(HttpServletRequest request,
  HttpServletResponse response)
  throws ServletException, IOException {

  response.setContentType("text/html");
  PrintWriter out = response.getWriter();
  out.println("<html>");
  out.println("<head><title>URL Rewriting</title></head>");
  out.println("<body>");

  // Encode a URL string with the session id appended
  // to it.
  String url = response.encodeRedirectURL(
   "http://localhost:8000/servlet/checkout?sid=5748");

  // Redirect the client to the new URL
  response.sendRedirect(url);

  out.println("</body></html>");
  out.close();
 }

 //Get Servlet information
 public String getServletInfo() {

  return "URLRewritingServlet Information";
 }
}
