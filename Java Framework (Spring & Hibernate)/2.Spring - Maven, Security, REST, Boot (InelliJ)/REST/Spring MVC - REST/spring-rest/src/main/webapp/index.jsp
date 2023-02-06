<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h1>Spring REST Demo</h1>
    <a href="${pageContext.request.contextPath}/test/hello">Hello</a>
    <a href="${pageContext.request.contextPath}/api/students">Get All students</a>
</body>
</html>
