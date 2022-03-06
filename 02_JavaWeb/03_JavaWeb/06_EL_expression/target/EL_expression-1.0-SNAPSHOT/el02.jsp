<%@ page import="com.example.el_expression.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: MUZUKI
  Date: 2021/10/6
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式获取不同类型数据</title>
</head>
<body>
    <%--1.获取基本数据类型--%>
    <% pageContext.setAttribute("username","zhangsan");%>
    ${username}

    <%--2.获取自定义对象类型--%>
    <%
        Student stu = new Student("张三",23);
        pageContext.setAttribute("stu",stu);
    %><br>
    自定义对象：${stu}
    <%--stu.name  实现原理 getName() --%>
    学生姓名：${stu.name}
    学生年龄：${stu.age} <br>

    <%--3.获取数组类型--%>
    <%
        String[] arr = {"Hello","world"};
        pageContext.setAttribute("arr",arr);
    %>
    数组：${arr}<br>
    0索引元素：${arr[0]}<br>
    1索引元素：${arr[1]}<br>

    <%--4.获取List集合--%>
    <%
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        pageContext.setAttribute("list",list);
    %>
    List集合：${list}<br>

    <%--5.获取Map集合--%>
    <%
        HashMap<String,Student> map = new HashMap<>();
        map.put("mu01",new Student("张三",23));
        map.put("mu02",new Student("李四",24));
        pageContext.setAttribute("map",map);
    %>
    Map集合：${map}<br>
    第一个学生对象：${map.mu01.name}
    ${map.mu01.age}
</body>
</html>
