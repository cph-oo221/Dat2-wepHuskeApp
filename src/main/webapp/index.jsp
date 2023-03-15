<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Main page</title>
    <link rel="icon" href="favicon/favicon.png">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>
<%-- BANNER & TITEL + ONE LINER --%>
<div class="text-center text-white mt-3 p-4 bg-primary rounded">
    <h1><b> Main Page </b></h1>
    <br/>
    <h4><b> - Welcome to the TODO List</b></h4>
</div>

<%--  ERROR MESSAGE FOR LOGIN  --%>
<div class="mt-2 text-danger">
    <p>${requestScope.errorMSG}</p>
</div>

<%--  ENTER USERNAME AND PASSWORD FOR LOGIN  --%>
<div class="text-center mt-3">
    <br/>
    <div class="EnterUserAndPass">
        <p class="fw-bold"> Enter username & password </p>
    </div>

    <form action="LoginServlet" method="post">
        <label for="name" class="text-end"> <b> </b> </label>
        <input type="text" id="name" name="name" placeholder="Username"><br>

        <label for="password"> <b>  </b> </label><br>
        <input type="password" id="password" name="password" placeholder="Password"><br>
        <br/>
        <input type="submit" class="btn btn-primary" value="Enter">
    </form>
</div>

<%--  LINK TO REGISTER A NEW USER  --%>
<div class="text-center mt-3">
    <form action="LoginServlet" method="get">
        <%--  style="text-decoration: none" <- this removes the line under a link/button     --%>
        <input type="submit" class="btn btn-link" style="text-decoration: none" value="Register new user">
    </form>
</div>
</body>
</html>