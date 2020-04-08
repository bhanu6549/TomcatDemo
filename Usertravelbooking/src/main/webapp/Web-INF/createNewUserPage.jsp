<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create User</title>
</head>
<body class="body">
	<div class="box">
		<h1>User-Registration</h1>
		<form:form action="/saveUser" method="post" modelAttribute="user" >
			<table>
				<tr>
					<td><label for="userName">User Name :</label></td>
					<td><form:input placeholder="Enter your name" path="userName" 
							id="userName" /><label id="userNameCheck"> </label></td>
				</tr>
				<tr>
					<td><label for="userAge">User Age :</label></td>
					<td><form:input placeholder="Enter your age" path="userAge" 
							id="userAge" />
						<h5 id="userAgeCheck"></h5></td>
				</tr>
			</table>
			<br>
			<button class="btn btn-primary" type="submit">Book</button>
		</form:form>

	</div>


</body>
</html>