<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
  <%--获取页面参数--%>
<form action="params/test" method="post">
    username:<input type="text" name="username"><br>
   age: <input type="text" name="age"><br>
   hobbies: <input type="checkbox" name="hobby" value="a">a<br>
    hobbies:<input type="checkbox" name="hobby" value="b">a<br>
    <input type="submit" value="test2">

</form>
</body>
</html>
