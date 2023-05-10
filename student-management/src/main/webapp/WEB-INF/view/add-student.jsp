<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/add-student.css"/>
<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/mystylesheet.css"/>
</head>
<body>
	<div align="center">
		<h1>Add Student</h1>
		<form:form action="save-student" modelAttribute="student" method="POST">
			
			<form:input path="id" hidden="true"/>
			<label>Name: </label>
			<form:input path="name" />
			<br />
			<label>Mobile: </label>
			<form:input path="mobile" />
			<br />
			<label>Country: </label>
			<form:input path="country" />
			<br />

			<input type="submit" value="submit" />

		</form:form>
	</div>
</body>
</html>