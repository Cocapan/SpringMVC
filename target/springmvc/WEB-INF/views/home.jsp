<%--
  Created by IntelliJ IDEA.
  User: panxuan
  Date: 2018/3/21
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>">
</head>
<body>
    <h1>Welcome to Spittr</h1>
    <a href="<c:url value="/spittles" />">Spittles</a>
    <a href="<c:url value="/spitter/register" />">register</a>
</body>
</html>
