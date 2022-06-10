<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="col-md-12 column" align="center">
        <form action="${pageContext.request.contextPath}/book/addBook" method="post">
            书籍名称:<input type="text" name="bookName" required><br><br><br>
            书籍数量:<input type="text" name="bookCounts" required><br><br><br>
            书籍描述:<input type="text" name="detail" required><br><br><br>
            <input type="submit" value="添加" class="btn btn-primary" align="left">
        </form>
    </div>
    <div class="row">
        <div class="col-md-12 column" align="right">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allBook">返回书籍列表</a>
        </div>
    </div>
</body>
</html>
