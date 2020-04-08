<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Booking Portal</title>

</head>
<center>
	<body class="body">
		<div align="center" class="box">
			<h1>Travel Booking Portal</h1>
			<form action="/createNewUser" class="input">
				<input type="submit" value="User-Registration" />
			</form>
			<br> <br>
			<form action="/bookTickets">
				<input type="submit" value="Travel-Booking" />
			</form>
			<br> <br>
			<form action="/getBookingDetails">
				<input type="submit" value="Booking- Details" />
			</form>
		</div>
	</body>
</html>