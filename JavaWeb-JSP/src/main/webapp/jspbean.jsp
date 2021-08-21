<%--
  Created by IntelliJ IDEA.
  User: 王森
  Date: 2021/8/14
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.wang.pojo.People" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
  People people=new People();
  people.setName("李四");
  people.setId(2);
  people.setAge(18);
  people.setAddress("派出所");
%>
<jsp:useBean id="people" class="com.wang.pojo.People" scope="page"/>
<jsp:setProperty name="people" property="name" value="张三"/>
<jsp:setProperty name="people" property="id" value="1"/>
<jsp:setProperty name="people" property="age" value="18"/>
<jsp:setProperty name="people" property="address" value="法院"/>
id:<% people.getId(); %>
name:<%people.getName(); %>
age:<%people.getAge(); %>
地址：<%people.getAddress(); %>
姓名：<jsp:getProperty name="people" property="name"/>
id:<jsp:getProperty name="people" property="id"/>
年龄：<jsp:getProperty name="people" property="age"/>
地址:<jsp:getProperty name="people" property="address"/>
</body>
</html>
