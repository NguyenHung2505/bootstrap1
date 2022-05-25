<%--
  Created by IntelliJ IDEA.
  User: QT
  Date: 23/05/2022
  Time: 5:00 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/productList?action=create" method="post">
    <input type="number" name="id" placeholder="enter in id"> <br>
    <br>
    <input type="text" name="name" placeholder="enter in name"><br>
    <br>
    <input type="number" name="price" placeholder="enter in price"><br>
    <br>
    <button>Click!</button>
</form>

</body>
</html>
