<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Main page</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="LoginServlet">Login</a>

<c:forEach var="emne" items="${requestScope.personer}">
    <br/>
    <p>${emne.value.navn}</p>
</c:forEach>


</body>
</html>