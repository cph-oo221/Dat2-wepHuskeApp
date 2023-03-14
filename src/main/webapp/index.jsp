<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Main page</title>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>



<div class="text-center text-white mt-3 p-5 bg-primary rounded">
    <h1>Main Page</h1>
</div>

<br/>
<br/>
<br/>
<a href="LoginServlet">Login</a>

<c:forEach var="emne" items="${requestScope.personer}">
    <br/>
    <p>${emne.value.navn}</p>
</c:forEach>


<form action="GetPersonServlet">
    <label>write name of person you want</label> <br/>
    <input type="text" name="name">
    <input type="submit" value="submit">
</form>

<div>
    <p>Name: ${requestScope.getPerson.navn}</p> <br/>
    <p>Password: ${requestScope.getPerson.kode}</p> <br/>
    <p>List: </p>
    <c:forEach var="emnelist" items="${requestScope.getPerson.stringArrayList}">
        <ol>
            <li>${emnelist}</li>
        </ol>
    </c:forEach>
</div>


</body>
</html>