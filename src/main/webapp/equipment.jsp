<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: danir
  Date: 14.09.2022
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Equipment</title>
    <link href="css/style.css" rel="stylesheet">
</head>
<body>
<p>Your equipment:</p>
<c:forEach var="prod" items="${equipment}">

    <p> <a href="$/destiny?chance=${prod}">${prod}</a></p>

</c:forEach>
</body>
</html>
