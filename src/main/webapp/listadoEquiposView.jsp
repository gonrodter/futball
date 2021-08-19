<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
    <link rel="icon" href="./images/iconimg.jpg">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="stylesheet.css">
<title>Listado de equipos</title>
</head>
<body>
<h1>Listado de Equipos</h1>
<table id="equipos">
			<tr>
				<th>Equipos</th>
				<th>Escudo</th>
				<th>Plantilla</th>
			</tr>

			<c:forEach items="${requestScope.listadoequipos}" var="listadoequipos">
				<tr>
					<td><c:out value="${listadoequipos.fullName}" /></td>
					<td><img style="width:50%" src="<c:out value="${listadoequipos.shield}"/>"></td>
					<td><a href="PlantillaController?equipo=<c:out value="${listadoequipos.idComp}"/>">Pulsa aquí</a></td>
			</c:forEach>
		</table>
</body>
</html>