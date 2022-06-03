<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>INSERT EMPLOYEES</h1>
<form:form action="" method="post" modelAttribute="employees">
	<table>
		<tr>
			<td>Employee Name:</td>
			<td>
				<form:input path="emplName" />
			</td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td>
				<input type="radio" value="true" name="gender">Male
				<input type="radio" value="false" name="gender">Female
			</td>
		</tr>
		<tr>	
			<td>Birthday:</td>
			<td>
				<input type="date" name="birthday">
			</td>
		</tr>
		<tr>	
			<td>Address:</td>
			<td>
				<form:input path="address" />
			</td>
		</tr>
		<tr>	
			<td>Department:</td>
			<td>
				<form:input path="department" />
			</td>
		</tr>
		<tr>	
			<td>Position:</td>
			<td>
				<form:input path="position" />
			</td>
		</tr>
		<tr>	
			<td>Salary:</td>
			<td>
				<form:input path="salary" type="number" />
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="Insert">
				<input type="reset" value="Clear">
			</td>
		</tr>
	</table>

</form:form>
</body>
</html>