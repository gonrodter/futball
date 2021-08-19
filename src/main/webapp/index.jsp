<!DOCTYPE html> 
<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>FUTBALL</title>
    <link rel="icon" href="./images/iconimg.jpg">
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.14/semantic.min.css">
  </head>

  <body>
    <div class="topnav">
        <a style="margin-left:28%" class="active" href="index.jsp">INICIO
            <i class="home icon"></i>
        </a>
        <a href="noticias.html">NOTICIAS
            <i class="newspaper outline icon"></i>
        </a>
        <a href="partidos.html">PARTIDOS
            <i class="calendar alternate outline icon"></i>
        </a>
        <a href="clasificacion.html">CLASIFICACIÓN
            <i class="list alternate outline icon"></i>
        </a>
        <a href="equipos.html">EQUIPOS
            <i class="sticky note outline icon"></i>
        </a>
    </div>
    <div class="parallax" data-parallax="scroll" data-image-src="/images/iconimg2.jpg">
    </div>
    <div style="margin-top:80px; margin-bottom: 50px; text-align:center">
    	<p style="font-size:20px"><a href="/GoogleCalendarEventList">Listado de eventos de Google Calendar</a></p>
<!-- 		Como nos devolvia que la lista de eventos daba null dedicimos crear un evento primero y aun asi nos devolvia null -->
    	<p style="font-size:20px"><a href="googleCalendarNewEvent.jsp">Crear nuevo evento en Google Calendar</a></p>
    </div>
    <div class="ui search">
        <div class="ui search" style="margin-bottom: 50px" id="searchDiv" align="center">
			<form action="BuscadorController" method="post">
				<input class="prompt" style="width:170px;"type="text" name="searchEquipo" placeholder="Buscar equipo de primera" required/> 
				<i class="search icon"></i>
			</form>
		</div>
	</div>
  </body>
</html>
