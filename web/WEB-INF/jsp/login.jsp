<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
    <script src="${pageContext.request.contextPath}/statics/jquery-3.4.1.js"></script>
    <script>
        function t1(){
            $.post({
                url:"${pageContext.request.contextPath}/user/ajax1",
                data:{"id":$("#id").val()},
                success:function (data){
                    if (data.toString()==="true"){
                        $("#idInfo").css("color","green");
                    }else {
                        $("#idInfo").css("color","red");
                    }
                    $("#idInfo").html(data);
                }
            })
        }
    </script>
</head>
<body>
<form action="/user/login" method="post">
    <span style="color: red">${msg}</span><br>
    <input type="text" name="id" id="id" onblur="t1()" required>
    <span id="idInfo"></span><br>
    <input type="password" name="password" required><br>
    <input type="submit" value="登录" >
</form>
<a href="${pageContext.request.contextPath}/user/toAddUser">注册</a>
</body>
</html>
