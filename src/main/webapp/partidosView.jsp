<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
    <link rel="icon" href="./images/iconimg.jpg">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="stylesheet.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
	<title>Jornadas</title>
</head>
<body>
	<div>
		<h1 align="center">Jornada <c:forEach end="0" items="${requestScope.jornada}" var="jornada">
						<c:out value="${jornada.round}"/>
					</c:forEach></h1>
		<table style="margin-left:450px">
			<tr>
				<th></th>
				<th>Local</th>
				<th>Resultado</th>
				<th>Visitante</th>
				<th></th>
				<th>Fecha y hora</th>
			</tr> 
			<c:forEach items="${requestScope.jornada}" var="jornada">
				<tr>
					<td><img style="width:50%" src="<c:out value="${jornada.localShield}" />"></td>
					<td><c:out value="${jornada.local}"/></td>
					<td><c:out value="${jornada.result}"/></td>
					<td><c:out value="${jornada.visitor}" /></td>
					<td><img style="width:50%" src="<c:out value=" ${jornada.visitorShield}" />"></td>
					<td><c:out value="${jornada.schedule}" /></td>
			</c:forEach>
		</table>
			<div id="searchDiv" align="center">
				<form id ="searchForm" action="PartidosController?division=<c:forEach end="0" items="${requestScope.jornada}" var="jornada">
					<c:out value="${jornada.competitionId}"/>
					</c:forEach>" method="post">

 					<input type="text" name="jornada" required/> 
 					<input type="submit" name="searchBoton" title="search" value="search">
				</form>
			</div>
	</div>
</body>
</html>