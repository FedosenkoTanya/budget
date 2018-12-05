<%--
  Created by IntelliJ IDEA.
  User: Eugenia
  Date: 15.11.2018
  Time: 2:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Simple web application</title>
</head>
<body>
    <h1>Spring boot - web application</h1>
    <form action="hello" method="post" onsubmit="return hello()">
        <input type="text" id="name" name="name" placeholder="Enter your name">
        <br>
        <button type="submit">Submit</button>
    </form>
    <script type="text/javascript" src="/resources/js/app.js"></script>
</body>
</html>
