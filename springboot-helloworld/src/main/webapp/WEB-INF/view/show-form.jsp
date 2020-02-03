<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processForm" method="post" modelAttribute="student">
  <div class="form-group">
    <label for="exampleFormControlInput1">First Name</label>
    <form:input path="firstName" />
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">First Name</label>
    <form:input  path="lastName"/>
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">Email</label>
    <form:input path="email"/>
  </div>
  <button type="submit" class="btn btn-primary">Add Student</button>
 
</form:form>
	
</body>
</html>