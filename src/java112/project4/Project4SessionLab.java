package java112.project4;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 * @author Eric Knapp
 * class Project4SessionLab
 *
 */

@WebServlet(name = "project4SessionLab", urlPatterns = { "/project4-session-lab" } )
public class Project4SessionLab extends HttpServlet {

    public void init() throws ServletException {
        // Initialization code
    }

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


        HttpSession session = request.getSession();

        Integer sessionCount = (Integer) session.getAttribute("project4SessionCounter");

        if (sessionCount == null) {
            sessionCount = new Integer(1);
            session.setAttribute("project4SessionCounter", sessionCount);
        } else {
            sessionCount++;
            session.setAttribute("project4SessionCounter", sessionCount);
        }

        String url = "/jsp/Project4SessionLab.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

}

