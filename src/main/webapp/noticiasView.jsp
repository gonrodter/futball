<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
    <link rel="icon" href="./images/iconimg.jpg">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="stylesheet.css">
<title>Noticias</title>
</head>
<body>

<c:forEach items="${requestScope.Noticias}" var="noticias">
		<h1 align = "Center"><c:out value="${noticias.title}" /></h1>
		<p align = "Right" ><c:out value="${noticias.author}" />&nbsp;<c:out value="${noticias.pubDate}" /></p>
		<div align="center"><c:out value="${noticias.description}" /></div>
		<div align="Left"><a href="<c:out value="${noticias.link}" />">Enlace a la noticia completa</a></div>
		<div align="center"><img style="width:30%" src="<c:out value="${noticias.enclosure.link}" />"></div>

	</c:forEach>


</body>
</html>