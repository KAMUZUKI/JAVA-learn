<%--
  Created by IntelliJ IDEA.
  User: MUZUKI
  Date: 2021/10/6
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式使用细节</title>
</head>
<body>
    <%
        pageContext.setAttribute("username","zhangsan");
        request.setAttribute("username","zhangsan");
        session.setAttribute("username","zhangsan");
        application.setAttribute("username","zhangsan");
    %>
    ${username}<br>

    <%--获取JSP中其他八个隐士对象  获取虚拟目录名称--%>
    <%= request.getContextPath()%>
    ${pageContext.request.contextPath}
</body>
</html>
