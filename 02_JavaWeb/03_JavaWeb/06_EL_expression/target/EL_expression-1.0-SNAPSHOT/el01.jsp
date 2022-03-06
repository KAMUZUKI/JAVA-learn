<%--
  Created by IntelliJ IDEA.
  User: MUZUKI
  Date: 2021/10/6
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式入门案例</title>
</head>
<body>
    <%--使用java代码在请求域中存入一个名称为message的数据--%>
    <% request.setAttribute("message","Expression Language");%>

    Java代码块获取：<% out.println(request.getAttribute("message")); %>  <br>
    JSP表达式获取： <%= request.getAttribute("message")%>  <br>
    EL表达式获取：  ${message}  <br>
</body>
</html>
