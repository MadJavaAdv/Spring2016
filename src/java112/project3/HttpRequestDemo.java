package java112.project3;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *  This is a demo of the HttpServletRequest.
 *
 *@author    pwaite
 */
@WebServlet(
    name = "requestDemo", 
    urlPatterns = { "/requestDemo" }
)
public class HttpRequestDemo extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              
        //request.setAttribute("myKey", "someValue");        
                
                
        response.setContentType("text/html");
        // set the response type before sending data
        PrintWriter  out  = response.getWriter();
        out.print("<HTML>");
        out.print("<HEAD><TITLE>Request Demo Output</TITLE></HEAD>");
        out.print("<BODY>");
        out.print("Here is the server name: " + request.getServerName());
        out.print("<BR />");
        //out.print("Here is the attribute myKey: " + request.getAttribute("myKey"));
        out.print("</BODY>");
        out.print("</HTML>");
        out.close();
    }

}

