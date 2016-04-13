package java112.project4;

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
    name = "jstlDemo",
    urlPatterns = { "/jstlDemo" }
)
public class JSTLDemo extends HttpServlet {

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

        String url = "/jstlDemo.jsp";

        // Use the StudentFactory to create some students
        StudentFactory studentFactory = new StudentFactory();
        List<Student> studentList = studentFactory.createStudentList();

        // Put the list of students in the request
        // ListOStudents is the attribute name: one key in the map of attributes
        // studentList is the value associated with the key
        request.setAttribute("ListOStudents", studentList);


        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);

    }
}

