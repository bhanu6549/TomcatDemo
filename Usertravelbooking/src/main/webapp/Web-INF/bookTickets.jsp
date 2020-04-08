<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Travel Registration</title>

</head>

<body class="body">
	<div class="box">
		<h1>Travel-Booking</h1>
		<form:form action="/saveBookingDetails" method="post"
			modelAttribute="bookingDetails">
			<table id=bookingDetails>
			<tr>
				<td>select user</td>
				<td><select name="userId">
				
						<c:forEach var="booking" items="${userIdList}">
							<option value="${booking}">${booking}</option>
						</c:forEach>
				</select>
				</td>
				</tr>
				<tr>
					<td>Source:</td>
					<td><form:input path="source" /></td>
					<form:errors path="source" cssClass="error"/><br><br>  
				</tr>
				<tr>
					<td>Destination:</td>
					<td><form:input path="destination" /></td>
				</tr>
				<tr>
					<td>Distance (KM)</td>
					<td><form:input path="journeyDistance" /></td>
				</tr>
				<tr>
					<td>DOJ:</td>
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
			<button type="submit" class="registerbtn">book</button>
			<br />
			<br />
			</form:form>
	</div>
	<br>
	
</body>
</html>