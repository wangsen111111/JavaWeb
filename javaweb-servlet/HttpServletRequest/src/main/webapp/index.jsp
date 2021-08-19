<%--
  Created by IntelliJ IDEA.
  User: 王森
  Date: 2021/8/10
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h1>登录</h1>
<div style="text-align: center">
    <%--以post方式提交表单，提交到我们的Login请求--%>
    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名:<input type="text" name="username"> <br>
        密码:<input type="password" name="password"> <br>
        爱好:
        <input type="checkbox" name="hobbys" value="篮球">篮球
        <input type="checkbox" name="hobbys" value="乒乓球">乒乓球
        <input type="checkbox" name="hobbys" value="羽毛球">羽毛球
        <input type="checkbox" name="hobbys" value="排球">排球
        <br>
        <input type="submit">
    </form>
</div>

</body>
</html>
