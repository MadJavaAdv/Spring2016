package java112.project3;
 
import java.io.*;
import java.util.*;
 
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
 
/**
 *  This class demonstrates Forwarding an HTTP Request
 *
 *@author    eknapp
 */
@WebServlet(
    name = "redirectDemo", 
    urlPatterns = { "/redirect-demo" }
)
public class RedirectionDemoServlet extends HttpServlet {
 
    /**
     *  Handles HTTP GET requests.
     *
     *@param  request               the HttpRequest
     *@param  response              the HttpResponse
     *@exception  ServletException  if there is a general 
     *                              servlet exception
     *@exception  IOException       if there is a general 
     *                              I/O exception
     */
    public void doGet(HttpServletRequest request, 
            HttpServletResponse response)
        throws ServletException, IOException {
 
        //Create the url
        String url = "/java112/transferDemo.jsp";
 
        // Redirect to JSP page
        response.sendRedirect(url);
 
    }
 
}
