<%--
  Created by IntelliJ IDEA.
  User: 杨霖的账户
  Date: 2020/11/1
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>fileupdate</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/update2" enctype="multipart/form-data" method="post">
    <input type="file" name="file"/>
    <input type="submit">
</form>
</body>
</html>
