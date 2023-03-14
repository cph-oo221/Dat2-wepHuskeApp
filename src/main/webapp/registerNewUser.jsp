<%--
  Created by IntelliJ IDEA.
  User: Oskar
  Date: 14-03-2023
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register New User</title>
</head>
<body>
<div class="text-center text-white mt-3 p-5 bg-primary rounded">
    <h1>Register New User</h1>
</div>


<div class="text-center mt-3">
    <form action="AddPersonServlet">
        <br/>
        <label for="name"> <b> Write a username: </b> </label><br>
        <input type="text" id="name" name="name" placeholder="Username"><br>

        <label for="password"> <b> Write a password: </b> </label><br>
        <input type="password" id="password" name="password" placeholder="Password"><br>
        <br/>

        <input type="submit" class="btn btn-primary" value="Sign Up">
    </form>
</div>


</body>
</html>