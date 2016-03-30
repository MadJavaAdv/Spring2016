<html>
  <head>
    <title>Team: All By Myself...</title>
  </head>
  <body>
    <h1>Request getQueryString</h1>
    <h2>Description: </h2>
        <ul>
        <li>Request refers to <a href="http://docs.oracle.com/javaee/6/api/javax/servlet/http/HttpServletRequest.html">
        HttpServletRequest</a>.</li>
        <li>Request includes both the implicit and explicit data from the browser/user.</li>
        <li><a href="http://docs.oracle.com/javaee/6/api/javax/servlet/http/HttpServletRequest.html#getQueryString()">
        getQueryString</a>: The data in the url following the path, for example:<br />
        http://localhost:8080/java112/myPage.jsp?variable1=something&variable2=something_else </li>
        <li>Everything after the ? is the querystring. </li> 
        <li>This is often data that is submitted as part of a form using a GET. 
        </li></ul>
    <h2>Syntax and example: </h2>
        Following is the result of executing request.getQueryString():
        <strong><%=request.getQueryString()%></strong><br />
    <h2>JSP Translator</h2>
        Here's how the JSP Translator handles request.getQueryString()<br />
        <img src="images/queryStringTransformed.png" />
    <h2>Best Practices</h2>
        Commonly used.<br />
    <h2>Drawbacks</h2>
        Might need to check for null. Remember this is user entered data.
  </body>
</html>
