<%@page import="crm.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>all customers</title>
</head>
<body>
<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">UID</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Email</th>
    </tr>
  </thead>
<%

List<Customer> list=(List<Customer>)request.getAttribute("SUCCESS");

for(Customer c:list){%>

	<tbody>
    <tr>
      <td><%out.println(c.getUId()); %></td>
      <td><%out.println(c.getFirstName()); %></td>
      <td><%out.println(c.getLastName()); %></td>
      <td><%out.println(c.getEmail()); %></td>
    </tr>
 
  </tbody>
<%}%>




  
</table>
</body>
</html>