package java112.project4;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(
    name = "HiddenFieldServlet",
    urlPatterns = { "/HiddenFieldServlet" }
)

public class HiddenFieldServlet extends HttpServlet {

    //Process the HTTP Post request
     public void doPost(HttpServletRequest request,
          HttpServletResponse response)
          throws ServletException, IOException {

          response.setContentType("text/html");
          PrintWriter out = response.getWriter();
          out.println("<html>");
          out.println("<head><title>HiddenFieldServlet" +
           "</title></head>");
          out.println("<body>");

          // Get the hidden inputs and echo them
          String user = request.getParameter("userName");
          String session = request.getParameter("session");

          out.println("<H3>" + user + " with session " + session +
           ", the contents of your search was:</H3><BR>");

          out.println(request.getParameter("searchCriteria"));


          out.println("</body></html>");
          out.close();
     }

     //Get Servlet information
     public String getServletInfo() {

         return "HiddenFieldServlet Information";
     }
}
