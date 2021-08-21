<%--
  Created by IntelliJ IDEA.
  User: 王森
  Date: 2021/8/13
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--http://localhost:8080/jspTag.jsp?name=zhangsan&age=18--%>
<jsp:forward page="index.jsp">
    <jsp:param name="name" value="zhangsan"></jsp:param>
    <jsp:param name="age" value="18"></jsp:param>
</jsp:forward>

</body>
</html>
