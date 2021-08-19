<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
    <link rel="icon" href="./images/iconimg.jpg">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="stylesheet.css">
<title>Search results</title>
</head>
<body>

<table id="clasificacion">
			<tr>
				<th>Nombre</th>
				<th>Alias</th>
				<th>Dorsal</th>
				<th>Pais</th>
				<th>Foto</th>

			</tr>

			<c:forEach items="${requestScope.plantilla}" var="plantillas">
				<tr>
					<td><c:out value="${plantillas.name} ${plantillas.lastName}" />
					<td><c:out value="${plantillas.nick}" /></td>
					<td><c:out value="${plantillas.squadNumber}" /></td>
					<td><c:out value="${plantillas.countryCode}" /></td>
					<td><img style="width:80%" src="<c:out value="${plantillas.image}" />"></td>
				</tr>
			</c:forEach>
		</table>

</body>
</html>