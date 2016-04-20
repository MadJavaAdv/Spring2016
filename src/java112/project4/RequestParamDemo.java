package java112.project4;


import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *  This class demonstrates getting input fields from an HTML form
 *
 *@author    pwaite
 */
@WebServlet(
        name = "requestParam",
        urlPatterns = { "/request-params" }
)
public class RequestParamDemo extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request               Description of the Parameter
     *@param  response              Description of the Parameter
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        String  param1  = request.getParameter("param1");

        log("param1: " + param1);

        String  param2  = request.getParameter("param2");

        log("param2: " + param2);
    }

}
