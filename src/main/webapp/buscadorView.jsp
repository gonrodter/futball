<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
	<head>
		<link rel="icon" href="./images/iconimg.jpg">
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="stylesheet.css">
		<title>Busqueda</title>
	</head>
	<body style = "margin:50px">
	    <div id="searchDiv">
			<form id="searchForm" action="BuscadorController?division=1" method="post">
				<input type="text" name="searchEquipo" required/> 
				<input type="submit" name="searchBtn" title="search" value="search">
			</form>
		</div>
		
		
			<c:forEach items="${requestScope.SportsDB}" var="SportsDB">
				<h1 align="center"><c:out value="${SportsDB.strTeam}" /></h1>
				<div align="center"><img style="width:20%" src="<c:out value="${SportsDB.strTeamBadge}" />"></div>
				<p><b>Fecha de creacion: </b><c:out value="${SportsDB.intFormedYear}" /></p>
				
				<h2 align="center">Estadio</h2>
				<c:out value="${SportsDB.strStadium}" />
				<c:out value="${SportsDB.strStadiumDescription}" />
				<p><b>Localizacion: </b><c:out value="${SportsDB.strStadiumLocation}" />
				<p><b>Capacidad total: </b><c:out value="${SportsDB.intStadiumCapacity}" />
				<div align="center"><img style="width:75%" src="<c:out value="${SportsDB.strStadiumThumb}" />"></div>
				
				<h2 align="center">Descripcion</h2>
				<c:out value="${SportsDB.strDescriptionES}" />
				<h2 align="center">Equipacion</h2>
				<div align="center"><img style="width:10%" src="<c:out value="${SportsDB.strTeamJersey}" />"></div>
			</c:forEach>
					<h2 align = "center">Posicion en la clasificacion actualmente</h2>
					<table style = "margin:auto"style = "margin:auto" id="clasificacion" align = "center">
					<tr>
						<th>Posición</th>
						<th>Equipo</th>
						<th>Puntos</th>
						<th>Victorias</th>
						<th>Empates</th>
						<th>Derrotas</th>
					</tr>
		
					<c:forEach items="${requestScope.BesoccerClasificacion}" var="clasificacion">
						<tr>
							<td><c:out value="${clasificacion.pos}" /></td>
							<td><c:out value="${clasificacion.team}" /></td>
							<td><c:out value="${clasificacion.points}" /></td>
							<td><c:out value="${clasificacion.wins}" /></td>
							<td><c:out value="${clasificacion.draws}" /></td>
							<td><c:out value="${clasificacion.losses}" /></td>
					</c:forEach>
				</table>
				
				
				
				<h2 align = "center">Ultimos 5 partidos</h2>
				<table style = "margin:auto" align="center">
					<tr>
						<th></th>
						<th>Local</th>
						<th>Resultado</th>
						<th>Visitante</th>
						<th></th>
						<th>Fecha y hora</th>
					</tr> 
					<c:forEach items="${requestScope.BesoccerPartidos}" var="jornada">
						<tr>
							<td><img style="width:50%" src="<c:out value="${jornada.localShield}" />"></td>
							<td><c:out value="${jornada.local}"/></td>
							<td><c:out value="${jornada.result}"/></td>
							<td><c:out value="${jornada.visitor}" /></td>
							<td><img style="width:50%" src="<c:out value=" ${jornada.visitorShield}" />"></td>
							<td><c:out value="${jornada.schedule}" /></td>
					</c:forEach>
				</table>
				
				<h2 align = "center">Plantilla</h2>
				<table style = "margin:auto" id="equipo" align = "center">
					<c:forEach items="${requestScope.BesoccerPlantillas}" var="plantillas">
					<tr>
						<th>Nombre</th>
						<th>Alias</th>
						<th>Dorsal</th>
						<th>Pais</th>
						<th>Foto</th>
					</tr>
					<tr>
						<td><c:out value="${plantillas.name} ${plantillas.lastName}" />
						<td><c:out value="${plantillas.nick}" /></td>
						<td><c:out value="${plantillas.squadNumber}" /></td>
						<td><c:out value="${plantillas.countryCode}" /></td>
						<td><img style="width:80%" src="<c:out value="${plantillas.image}" />"></td>
					</tr>
					</c:forEach>
				</table>
				
			
		<h2 align = "Center">Noticias</h2>
		
		
		<c:forEach items="${requestScope.Noticias}" var="noticias">
				<h3 align = "Center"><c:out value="${noticias.title}" /></h3>
				<p align = "Right" ><c:out value="${noticias.author}" />&nbsp;<c:out value="${noticias.pubDate}" /></p>
				<div align="center"><c:out value="${noticias.description}" /></div>
				<div align="Left"><a href="<c:out value="${noticias.link}" />">Enlace a la noticia completa</a></div>
				<div align="center"><img style="width:30%" src="<c:out value="${noticias.enclosure.link}" />"></div>
		
		</c:forEach>
		
	
	</body>
</html>