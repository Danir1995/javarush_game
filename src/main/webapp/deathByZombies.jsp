<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: danir
  Date: 14.09.2022
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Death by zombies</title>
    <link href="css/style.css" rel="stylesheet">
</head>
<body>
<c:if test="${chance eq 'machineGun'}">
    <p><IMG class="displayed" src = "https://www.ferra.ru/imgs/2018/11/26/18/2660517/7e7272df5673b60188fea1fa5756ac59d95436f2.jpg" width = "400" height = "256"></p>
    <p>You prepared machine gun to attack, but the weapon was defective and you couldn't set it up...</p>
    <p>You left the machine gun and tried to fight with zombies...</p>
    <p>But it was too much, you killed 2 and started to get tired...</p>
    <p>Zombies killed you...</p>

</c:if>
<c:if test="${chance eq 'medicine'}">
    <p><IMG class="displayed" src = "http://www.buyzombie.com/wp-content/uploads/2011/03/zombies-eating.jpg" width = "400" height = "256"></p>
    <p> You consumed medicine. You don't know why... Zombies killed you.</p>
    <p>YOU LOSE</p>
</c:if>
<c:if test="${chance eq 'pistol'}">
    <p>You took a pistol. There only 4 zombies and you have 5 bullets! I am lucky!</p>
    <p>You killed them!</p>
    <p>And you went away... Like a hero...</p>
    <p>You went as fast as possible because it could be more zombies there.</p>
    <p>You ended up in the park, breathed fresh air and when you turned towards the river, you saw about 50 zombies running in your direction... you have one bullet left...</p>
    <p>What will you do?</p>
</c:if>
<p>You tried to escape, but zombies surrounded you...</p>
<p>-A-a-a-a-a-a!(river of your blood)</p>
<p>Information of <%=session.getAttribute("user")%>.</p>
<p>START AGAIN?</p>
<button class="btnRed" onclick="window.location='index.jsp'">YES</button>
</body>
</html>
