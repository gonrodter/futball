<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="icon" href="./images/iconimg.jpg">
<meta charset="UTF-8">
<title>Añadir evento</title>
</head>
<body>
	<h1>Añadir un evento a tu calendario</h1>
	
	<div>
	 
		<form action="newevent" method="post">
	
			<label for="name">Event's name: </label> 
			<input id="name" name="name" type="text" required="required"> 
						
			<input name="eventId" type="hidden" value="${param['eventId']}">
	
			<div>
				<button type="submit" class="button">Submit</button>
				<button type="button" onClick="javascript:window.location.href='index.jsp'" class="button">Cancel</button>
			</div>
	
		</form>
		
	</div>

</body>
</html>