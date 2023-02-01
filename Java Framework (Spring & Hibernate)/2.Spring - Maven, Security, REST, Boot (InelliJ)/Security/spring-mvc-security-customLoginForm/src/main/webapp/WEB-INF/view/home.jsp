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

    <form:form action="${pageContext.request.contextPath}/logout"  method="post">
        <input type="submit" value="Logout" />
    </form:form>
</body>
</html>
