
package java112.project4;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
/**
 *  This is part of module 4 and demonstrates getting an attribute from the
 *  session.
 *
 */
@WebServlet(
     name = "gettingAttribute",
     urlPatterns = { "/getting-session-attribute" }
)
public class GettingAnAttributeServlet extends HttpServlet {

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

        response.setContentType("text/html");
        PrintWriter  out          = response.getWriter();

        HttpSession  session      = request.getSession();
        String       sessionName  =
                (String) session.getAttribute("session_name");

        out.print("<html><head></head><body><h3>Getting a "
                + "session in a Servlet</h3><h4>");

        if (sessionName == null || sessionName.equals("")) {
            out.print("Attribute not found");
        }
        else {
            out.print("Attribute found: ");
            out.print(sessionName);
        }

        out.print("</body></html>");
    }

}

