<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org" >
<head>
<meta charset="UTF-8">
<title>List employees page!</title>
</head>
<body>
	<h1>List Employees</h1>
	<table id="table-1" border="1">
		<thead>
			<tr>
				<th>Employee Id</th>
				<th>Employee Name</th>
				<th>Gender</th>
				<th>Birthday</th>
				<th>Address</th>
				<th>Department</th>
				<th>Position</th>
				<th>Salary</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${listEmployees }" var="item">
			<tr >
				<td>${item.emplId }</td>
				<td >${item.emplName }</td>
				<td >${item.gender }</td>
				<td>${item.birthday }</td>
				<td>${item.address }</td>
				<td>${item.department }</td>
				<td>${item.position }</td>
				<td>${item.salary }</td>
				<td><a href="employees/editEmployee/${item.emplId }">Edit</a></td>
				<td><a href="employees/deleteEmployee/${item.emplId }" onclick="return confirm('Ban co chac muon xoa ko?')">Delete</a></td>
			</tr>
			</c:forEach>
		</tbody>

	</table>
	<a href="employees/initInsertEmployees">Add new employees</a>
</body>
</html>