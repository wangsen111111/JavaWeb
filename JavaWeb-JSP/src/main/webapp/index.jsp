<html>
<body>
<h2>Hello World!</h2>
</body>
</html>

<%--jsp表达式
     作用：用来将程序的结果输出到客户端
     <%= 变量或者表达式%>
     --%>
<%= new java.util.Date()%>
<%--jsp脚本片段--%>
<%
    int sum = 0;
    for (int i = 1; i <=100 ; i++) {
        sum+=i;
    }
%>
<%--在代码嵌入HTML元素--%>
<%
    for (int i = 0; i < 5; i++) {
%>
<h1>Hello,World  <%=i%> </h1>
<%
    }
%>
<%--在代码嵌入HTML元素--%>
<%for (int i = 0; i < 5; i++) {%>
<h1>Hello,World  ${i} </h1>
<%}%>
<%!
    static {
        System.out.println("Loading Servlet!");
    }

    private int globalVar = 0;

    public void exit(){
        System.out.println("进入了方法！");
    }
%>

