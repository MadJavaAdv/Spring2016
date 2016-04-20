<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>JSTL Scope Example</title>
</head>
<body>
 <p>Username is: ${userName} /><p>
 <p>My salary is: <c:out value="${salary}"/><p>

</body>
</html>

