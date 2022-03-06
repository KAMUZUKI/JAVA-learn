<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <%--这是注释--%>
    <title>JSP - Hello World</title>
</head>
<body>
    这是我的第一个JSP
<br/>
<a href="hello-servlet">Hello Servlet</a>
    <%--
        2.JAVA代码块
    --%>
    <%
        System.out.println("hello JSP");
        out.println("hello JSP<br>");
        String s = "Hello JSP<br>";
        out.println(s);
    %>

    <%--
        3.jsp表达式
        <%="Hello"%>   相当于 out.println("Hello");
    --%>
    <%="Hello"%>

    <%--
        4.jsp中的声明（变量或方法）
        如果加！ 代表声明的是成员变量
        如果不加！ 代表声明的是局部变量
    --%>
    <%! String s= "abc"; %>
    <%=s%>
</body>
</html>