<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="userName" scope="session" value="Advanced Java Class"/>
<html>
  <head>
    <title>JSTL Demo</title>
  </head>

  <body>
    <h3>Welcome ${userName} to the JSTL Demo</h3>
    <br />

     <c:forEach var="myStudent" items="${ListOStudents}">
        <li>${myStudent}</li>
    </c:forEach>

    <a href="/java112">Home</a>
  </body>
</html>

<%--

1. Import the tag lib:
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

2. Create and use a variable
<c:set var="userName" scope="session" value="Advanced Java Class"/>


3.  Here is the student list :
    <c:forEach var="myStudent" items="${ListOStudents}">
        <li>${myStudent}</li>
    </c:forEach>
--%>


