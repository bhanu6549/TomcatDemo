<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details Page</title>

</head>
<body>
<header class="h">
		<h1 align="center">Booking Ticket Counter</h1>
	</header><br>
<div align="center">
<fieldset class="">
				<table border="1">
				<thead>
					<tr>
						<th>User ID</th>
						<th>Traveling To</th>
						<th>Traveling From</th>
						<th>Traveling Date</th>
						<th>Edit Bookings</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${bookingDetails2}" var="booking">
					<tr>
						<td><c:out value="${booking.user.userId}" /></td>
						<td><c:out value="${booking.source}" /></td>
						<td><c:out value="${booking.destination}" /></td>
						<td><c:out value="${booking.journeyDate}" /></td>
						<td><a
							href="/edit/<c:out value="${booking.bookingId}" />"><input type="button" value="UPDATE"/></a></td>
						</tr>
						</c:forEach>
				</tbody>
			</table>
			</fieldset>
				</div>
</body>
</html>