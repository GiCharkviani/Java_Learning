<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Customer Login Page</title>
</head>
<body>
    <h3>My Customer Login Page</h3>

    <form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="post">

        <%--    Check for login error   --%>
        <c:if test="${param.error != null}">
            <p style="color: red">Sorry! You entered invalid username or password</p>
        </c:if>

        <label>
            User name:
            <input type="text" name="username"/>
        </label>

        <label>
            Password:
            <input type="password" name="password"/>
        </label>

        <input type="submit" value="Login" />
    </form:form>
</body>
</html>
