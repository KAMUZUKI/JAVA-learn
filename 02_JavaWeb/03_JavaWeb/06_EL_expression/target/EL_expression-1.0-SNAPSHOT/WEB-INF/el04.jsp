<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: MUZUKI
  Date: 2021/10/6
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL两个特殊的运算符</title>
</head>
<body>
    <%--empty运算符：
              它会判断：对象是否为null，字符串是否为空字符串，集合中元素是否是0个
          --%>
    <% String str = null;
      String str1 = "";
      List<String> slist = new ArrayList<String>();
      pageContext.setAttribute("str", str);
      pageContext.setAttribute("str1", str1);
      pageContext.setAttribute("slist", slist);
    %>
    ${empty str}============当对象为null返回true<br/>
    ${empty str1 }==========当字符串为空字符串是返回true(注意：它不会调用trim()方法)<br>
    ${empty slist}==========当集合中的元素是0个时，是true
    <hr/>
    <%--三元运算符
         条件?真:假
    --%>
    <% request.setAttribute("gender", "female"); %>
    <input type="radio" name="gender" value="male" ${gender eq "male"?"checked":""} >男
    <input type="radio" name="gender" value="female" ${gender eq "female"?"checked":""}>女
</body>
</html>
