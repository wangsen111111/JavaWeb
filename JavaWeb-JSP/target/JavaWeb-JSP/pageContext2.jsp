<%--
  Created by IntelliJ IDEA.
  User: 王森
  Date: 2021/8/13
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //从pageContext取出，我们通过寻找的方式
    //作用域：从底层到高层{page->request->session->application}
    //JVM:双亲委派机制
    String name1 = (String)pageContext.findAttribute("name1");
    String name2 = (String)pageContext.findAttribute("name2");
    String name3 = (String)pageContext.findAttribute("name3");
    String name4 = (String)pageContext.findAttribute("name4");
%>
<%--使用EL表达式输出${}  --%>
<h1>取出的名字为：</h1>
<h2>${name1}</h2>
<h2>${name2}</h2>
<h2>${name3}</h2>
<h2>${name4}</h2>




<%pageContext.setAttribute("hello","张三",pageContext.SESSION_SCOPE);
%>
</body>
</html>
