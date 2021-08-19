<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.14/semantic.min.css">
		<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
	    <link rel="icon" href="./images/iconimg.jpg">
	    <link rel="stylesheet" type="text/css" href="stylesheet.css">
		<title>Añadir un evento</title>
	</head>
	<body class="neweventform">
		<p class="message">${message}</p>
		
			<form action="/GoogleCalendarNewEvent" method="post">
				<div class="form__group">
				  <input type="text" class="form__input" id="title" name = "title"placeholder="Event's title" required/>
				  <label for="title" class="form__label">Event's title</label>
				
		        <label style="font-size:25px" for="description">Description:</label><br/><br/>
		        <textarea class="description" name="description">${description}</textarea><br/>
		       	<label style="font-size:25px; margin-right:10px" for="start">Event starts:</label>
		        <input type="date" name="start" id="start" required/><br/></br>
		        <label style="font-size:25px; margin-right:10px" for="end">Event ends:</label>
		        <input type="date" name="end" id="end" required/>
		        </div>
		        
		
		        <div style = "margin-top:30px">
		        	<button type="submit" class="ui teal button">Submit</button>
		            <button type="button" onClick="javascript:window.location.href = '/'" class="ui teal button">Cancel</button>
		        </div>
	        </form>
	</body>
</html>
