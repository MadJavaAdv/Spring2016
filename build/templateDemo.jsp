<%--Templating
    1. Create a jsp directory in public_html to house the various jsp parts.
    2. Add the taglib directive for core taglib: <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    3. Copy the selected "part" of the jsp into it's own jsp'
    4. Use the import tag to include the jsp part in the original jsp
        <c:import url="Relative URL" />
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="jsp/head.jsp" />


<body class="wrap">


<c:import url="jsp/header.jsp" />


<c:import url="jsp/carousel.jsp" />

        
<c:import url="jsp/ThreeColumnContent.jsp" />

<c:import url="jsp/recentPosts.jsp" />
    
</div>

<c:import url="jsp/footer.jsp" />

<script src="js/jquery.prettyPhoto.js"></script>
</body>
</html>

