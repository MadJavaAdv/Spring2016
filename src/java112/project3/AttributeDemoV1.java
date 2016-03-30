package java112.project3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java112.demo.*;
import java.util.*;

/**
 *  Demo of using httpServletRequest and attributes
 *
 *@author    pwaite
 */
@WebServlet(
    name = "attributeDemo",
    urlPatterns = { "/attributeDemoV1" }
)
public class AttributeDemoV1 extends HttpServlet {

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

        request.setAttribute("someVariable", "123");
        request.setAttribute("pageTitle", "EL Demo");
        
        Student student = new Student("SuperStar", "Student", "A", 111222);

        request.setAttribute("Mike", student);

        
        String url = "/elDemo.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
            
        

     
          
    }
}

