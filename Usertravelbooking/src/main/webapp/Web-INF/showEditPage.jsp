<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Booking Page</title>
</head>

<body>
<header class="h">
		<h1 align="center">Booking Ticket Counter</h1>
	</header><br>
	<div align="center">
	<form:form action="/editBookingDetails" method="post" modelAttribute="bookingDetails">
				<table>
					<tr>
						<td>Booking ID</td>
						<td><form:input path="bookingId" name="bookingId" readonly="true" /></td>
					</tr>
					<tr>
						<td>Journey Source</td>
						<td><form:input path="source" name="source" id="journeySource" /></td>
					</tr>
					<tr>
						<td>Journey Destination</td>
						<td><form:input path="destination" id="journeyDestination" /></td>
					</tr>
					<tr>
						<td>Journey Distance</td>
						<td><form:input path="journeyDistance" id="journeyDistance" /></td>
					</tr>
					<tr>
						<td>Date Of Journey</td>
						<td><form:input type="date" path="journeyDate" /></td>
					</tr>
					<tr>
						<td>Food Preferences</td>
						<td><form:radiobutton path="foodPreferences"
								value="VEGETERIAN" />VEGETERIAN <form:radiobutton
								path="foodPreferences" value="NON-VEGETERIAN" />NON-VEGETERIAN</td>
					</tr>
					<tr>
						<td>Travel With</td>
						<td><form:checkbox path="travelingWith" value="PASSPORT" />PASSPORT
							<form:checkbox path="travelingWith" value="VISA" />VISA</td>
					</tr>
				</table>
				<button type="submit" onclick="return validate()">UPDATE</button>
				</form:form>
			</div>
</body>
</html>