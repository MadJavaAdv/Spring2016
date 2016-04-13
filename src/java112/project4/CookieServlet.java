package java112.project4;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import javax.servlet.annotation.*;

@WebServlet(
    name = "cookieServlet",
    urlPatterns = { "/cookieServlet" }
)
public class CookieServlet extends HttpServlet {

    //Initialize global variables

    private String getCurrentUser(String value) {

    String userName = new String("");

    // This would normally be a Select from a database or
    // other storage area.
    if ( value.equals("564XX892") ) {
        userName = new String("Bob");
    }
    return userName;
 }

 //Process the HTTP Get request
    public void doGet(HttpServletRequest request,
        HttpServletResponse response)
    throws ServletException, IOException {

      // Get the list of Cookies stored in the request
      Cookie[] cookieList = request.getCookies();
      String user = null;
      String responseString = null;

      if ( cookieList != null ) {

          // Cookies found, let's get the session id
          for ( int x = 0; x < cookieList.length; x++ ) {

              String name = cookieList[x].getName();

              if ( name.equals("session_id") ) {

                  // Get the user based on the session id
                  user = getCurrentUser(cookieList[x].getValue());
                  break;
              }
          }
      }

      if ( user == null ) {

       // Let's create a cookie that represents a unique
       // session id.
       response.addCookie(new Cookie("session_id", "564XX892"));
       responseString = new String("Welcome to our site, " +
        "we have created a session for you.");
      }
      else {

       responseString = new String("Hello : " + user);
      }

      response.setContentType("text/html");
      PrintWriter out = response.getWriter();

      out.println("<html>");
      out.println("<head><title>CookieServlet</title></head>");

      out.println("<body>");

      out.println(responseString);

      out.println("</body></html>");
      out.close();
     }

     //Get Servlet information
     public String getServletInfo() {

      return "CookieServlet Information";
     }
}
