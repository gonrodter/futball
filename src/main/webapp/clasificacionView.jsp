<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
    <link rel="icon" href="./images/iconimg.jpg">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="stylesheet.css">
<title>Clasificación</title>
</head>
<body>

		<table id="clasificacion">
			<tr>
				<th>Posición</th>
				<th>Equipo</th>
				<th>Puntos</th>
				<th>Victorias</th>
				<th>Empates</th>
				<th>Derrotas</th>
			</tr>

			<c:forEach items="${requestScope.clasificacion}" var="clasificacion">
				<tr>
					<td><c:out value="${clasificacion.pos}" /></td>
					<td><c:out value="${clasificacion.team}" /></td>
					<td><c:out value="${clasificacion.points}" /></td>
					<td><c:out value="${clasificacion.wins}" /></td>
					<td><c:out value="${clasificacion.draws}" /></td>
					<td><c:out value="${clasificacion.losses}" /></td>
			</c:forEach>
		</table>

</body>
</html>