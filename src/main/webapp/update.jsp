<%--
  Created by IntelliJ IDEA.
  User: 25610
  Date: 2020/2/1
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/hello/update" method="post">
    ID:<input type="text" name="id" value="${student.id}" readonly/><br/>
    name:<input type="text" name="name" value="${student.name}"/><br/>
    age:<input type="text" name="age" value="${student.age}"/><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>