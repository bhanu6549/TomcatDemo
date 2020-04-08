<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Booking Details</title>

</head>
<body>
	<header class="h">
		<h1 align="center">Booking Details</h1>
	</header>
	<div align="center">
		<fieldset class="f">
			<form:form action="/getDetailsByUserID" method="get"
				modelAttribute="bookingDetails">
				<label>User ID</label>
				<select name="userId" id="${userId}" >
					<c:forEach var="booking" items="${userIdList}">
						<option value="${booking}">${booking}</option>
					</c:forEach>
				</select>
				<br>
				<br>
				<label>JOURNEY SOURCE</label>
				<form:input path="source" id="journeySource" />
				<br>
				<br>
				<button type="submit">GET BOOKING DETAILS</button>
				<br>
				<br>
			</form:form>
		</fieldset>
	</div>
</body>
</html>