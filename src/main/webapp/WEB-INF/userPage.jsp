<%--
  Created by IntelliJ IDEA.
  User: Oskar
  Date: 14-03-2023
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${sessionScope.bruger.navn}</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="text-center text-white mt-3 p-5 bg-primary rounded">
    <h1>User over view for ${sessionScope.bruger.navn}</h1>
</div>



<%--
// get person

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
</div>--%>

</body>
</html>
