<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Main page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="text-center text-white mt-3 p-5 bg-primary rounded">
    <h1><b> Main Page </b></h1>
</div>

<p class="text-red">${requestScope.errorMSG}</p>

<div class="text-center mt-3">
    <form action="LoginServlet" method="post">
        <br/>
        <label for="name"> <b> Skriv dit navn: </b> </label><br>
        <input type="text" id="name" name="name" placeholder="Username"><br>

        <label for="password"> <b> Skriv din kode: </b> </label><br>
        <input type="password" id="password" name="password" placeholder="Password"><br>
        <br/>
        <input type="submit" class="btn btn-primary" value="Enter">
    </form>
</div>

<div class="text-center mt-3">
    <form action="LoginServlet" method="get">
        <input type="submit" class="btn btn-link" value="Register new user">
    </form>
</div>
</body>
</html>