<%--
  Created by IntelliJ IDEA.
  User: 帆丶
  Date: 2022/3/31
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<form action="/user/addUser" method="post">
    <input type="text" name="id" required><br>
    <input type="text" name="username" required><br>
    <input type="text" name="password" required><br>
    <input type="submit" value="注册"><br>
    <a href="${pageContext.request.contextPath}/user/toLogin">返回登录页面</a>
</form>
</body>
</html>
