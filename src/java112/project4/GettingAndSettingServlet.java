package java112.project4;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *  This is part of module 4 and demonstrates
 *  getting and setting attributes in the session.
 *
 *@author    eknapp
 */
@WebServlet(
    name = "gettingSettingAttribute",
    urlPatterns = { "/getting-setting-attribute" }
)
public class GettingAndSettingServlet extends HttpServlet {

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
        String       myAttribute  =
                (String) session.getAttribute("myAttribute");

        out.print("<html><head></head><body><h3>Getting and "
                + "Setting a session attribute in a Servlet</h3><h4>");

        if (myAttribute == null || myAttribute.equals("")) {
            out.print("myAttribute not found, creating myAttribute");
            session.setAttribute("myAttribute",
                    "This is a session attribute");
        } else {
            out.print("myAttribute found: ");
            out.print(myAttribute);
        }

        out.print("</body></html>");
    }

}
