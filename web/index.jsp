<%--
  Created by IntelliJ IDEA.
  User: 帆丶
  Date: 2022/3/31
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <style>
        a{
            text-decoration:none;
            color:black;
            font-size: 18px;
        }
        h3{
            width:180px;
            height:38px;
            margin: 100px auto;
            text-align:center;
            line-height: 38px;
            background: cornflowerblue;
            border-radius: 5px;
        }
    </style>
</head>
<body>
<h3>
    <a href="${pageContext.request.contextPath}/user/toLogin">用户登录</a>
</h3>
</body>
</html>
