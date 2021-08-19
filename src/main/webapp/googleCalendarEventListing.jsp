<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="icon" href="./images/iconimg.jpg">
<meta charset="UTF-8">
<title>Listado de eventos</title>
</head>
<body>
	<div>
		<h1>Eventos:</h1>
		<table id="clasificacion">
			<tr>
				<th>Evento</th>
				<th>Descripción</th>
				<th>Empieza</th>
				<th>Termina</th>

			</tr>

			<c:forEach items="${requestScope.evento}" var="evento">
				<tr>
					<td><c:out value="${evento.title}" />
					<td><c:out value="${evento.description}" /></td>
					<td><c:out value="${evento.start}" /></td>
					<td><c:out value="${evento.end}" /></td>
					<td>
                    <a href="/GoogleCalendarUpdateEvent?id=${evento.id}"><img src="./images/edit.png" width="30px"></a>
                	</td>
                	<td>
                    <a href="/GoogleCalendarDeleteEvent?id=${evento.id}"><img src="./images/delete.png" width="30px"></a>
                	</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>