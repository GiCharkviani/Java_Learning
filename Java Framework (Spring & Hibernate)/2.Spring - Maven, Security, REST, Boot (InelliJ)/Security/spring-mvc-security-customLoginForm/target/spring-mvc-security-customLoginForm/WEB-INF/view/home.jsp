<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h1>Welcome to Gis App</h1>
    <hr>
<%--        Display user name and role--%>
    User: <security:authentication property="principal.username" />
    <br>
    Role(s) <security:authentication property="principal.authorities" />
    <hr>

    <%--    Add a link to point to /leaders ... this is for the managers--%>
    <p>
        <a href="${pageContext.request.contextPath}/leaders" >Leadership Meeting</a>
        (Only for Manager peeps)
    </p>
    <%--    Add a link to point to /systems ... this is for the admins--%>
    <p>
        <a href="${pageContext.request.contextPath}/systems" >IT Systems Meeting</a>
        (Only for Admin peeps)
    </p>

    <hr>

    <form:form action="${pageContext.request.contextPath}/logout"  method="post">
        <input type="submit" value="Logout" />
    </form:form>
</body>
</html>
