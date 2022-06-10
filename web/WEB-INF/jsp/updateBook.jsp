<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="col-md-12 column" align="center">

        <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
            <input type="hidden" name="bookID" value="${Ibook.bookID}"/><br>
            书籍名称:<input type="text" name="bookName" value="${Ibook.bookName}" required ><br><br>
            书籍数量:<input type="text" name="bookCounts" value="${Ibook.bookCounts}" required ><br><br>
            书籍描述:<input type="text" name="detail" value="${Ibook.detail}" required ><br><br>
            <input type="submit" value="修改" class="btn btn-primary" align="left">
        </form>
    </div>
    <div class="row">
        <div class="col-md-12 column" align="right">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allBook">返回书籍列表</a>
        </div>
    </div>
</body>
</html>

