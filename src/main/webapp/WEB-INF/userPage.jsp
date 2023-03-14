<%--
  Created by IntelliJ IDEA.
  User: Oskar
  Date: 14-03-2023
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>${sessionScope.bruger.navn}'s page</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>
<%-- BANNER & TITEL --%>
<div class="text-center text-white mt-3 p-5 bg-primary rounded">
    <h1>User overview for ${sessionScope.bruger.navn}</h1>
</div>

<%--  UPDATE MSG  --%>
<div class="mt-1 mb-1">
    <h3>${requestScope.msg}</h3>
</div>

<%-- ADD ITEM TO THE TODO LIST --%>
<div class="text-center mt-4">
    <form action="AddItemServlet">
        <label> <b> Add new item </b> </label> <br/>
        <input type="text" name="item" placeholder="New item">
        <input type="submit" class="btn btn-primary" value="submit">
    </form>
</div>

<%-- SORT LIST IN ALPHABET ORDER--%>
<div class="text-end mt-2">
    <form action="SortItemListServlet">
        <input type="submit" class="btn btn-primary" value="Sort - abc">
    </form>
</div>


<%--  ITEM LIST WITH REMOVE  --%>
<table class="table table-dark table-striped">
    <tr>
        <th>TO-DO list:</th>
        <th>Remove</th>
    </tr>

    <c:forEach var="emne" items="${sessionScope.bruger.stringArrayList}">
        <tr>
            <td><b> ${emne} </b></td>

            <td>
                <form action="RemoveItemServlet">
                    <input type="hidden" name="itemRemove" value="${emne}">
                    <input type="submit" class="btn btn-primary" value="Remove">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

<%--  SAVE CHANGE TO THE ITEM LIST  --%>
<div class="mb-3">
    <form action="SaveServlet">
        <input type="submit" class="btn btn-primary" value="Save">
    </form>
</div>

<%--  LOGOUT BUTTON  --%>
<div class="mb-3">
    <form action="logoutServlet" method="post">
        <input type="submit" class="btn btn-primary" value="Logout">
    </form>
</div>
</body>
</html>