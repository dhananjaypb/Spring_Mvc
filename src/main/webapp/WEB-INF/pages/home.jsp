<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Information</title>
</head>
<body>
	<div align="center">
		<h1>User List</h1>
		
		<table border="1">

			<th>Id</th>
			<th>Name</th>
			<th>City</th>
			<th>Pincode</th>

			<c:forEach var="User" items="${listUser}">
				<tr>

					<td>${User.userId}</td>
					<td>${User.userName}</td>
					<td>${User.city}</td>
					<td>${User.pincode}</td>
					<td><a href="editUser?id=${User.userId}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteUser?id=${User.userId}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New User Register <a href="newUser">here</a>
		</h4>
	</div>
</body>
</html>