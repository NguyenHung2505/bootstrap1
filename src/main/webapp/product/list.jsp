<%--
  Created by IntelliJ IDEA.
  User: QT
  Date: 23/05/2022
  Time: 2:53 CH
  To change this template use File | Settings | File Templates.
--%>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>DANH SACH SAN PHAM</h1>
<h1><a href="/productList?action=create">tao danh sach</a>
    <c:forEach items ='${danhSach}' var="sanPham">
        <h3>${sanPham.id}, ${sanPham.name}, ${sanPham.price} , <a href="/productList?action=edit&id=${sanPham.id}"> sua</a> </h3>
    </c:forEach>
</h1>
</body>
</html>
