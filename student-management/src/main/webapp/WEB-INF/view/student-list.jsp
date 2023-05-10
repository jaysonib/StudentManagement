<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page isELIgnored="false" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/mystylesheet.css"/>
</head>
<body>
	
	<div class="container">
	<h1>Spring Project - Student Management</h1>
	<br/>
	<form action="showAddStudentPage">
		<input type="submit" value="add" class="btn btn-outline-primary"/>
	</form>
	<br/>

	<table  border="1" class="table table-striped">
		<thead>
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>Mobile</td>
				<td>Country</td>
			</tr>
		</thead>
		<c:forEach items="${students}" var="student">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.mobile}</td>
				<td>${student.country}</td>
				<td><a href="/student-management/updateStudent?userId=${student.id }">Update</a></td>
				<td><a href="/student-management/deleteStudent?userId=${student.id }" onClick="if(!(confirm('Are you sure you want to delete this record?'))) return false;">Delete</a></td>  
			</tr>
		</c:forEach>
	</table>
	<img alt="students images" src="/student-management/URLToReachImagesFolder/student.avif" />
	</div>
</body>
</html>