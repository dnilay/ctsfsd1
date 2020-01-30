<%@page import="crm.mapper.Customermapper"%>
<%@page import="crm.mapper.CustomerDTOImpl"%>
<%@page import="crm.model.CustomerDto"%>
<%@page import="crm.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >
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


Object object=request.getAttribute("SUCCESS");

	List<Customer> list=(List<Customer>)object;

Customermapper impl=new Customermapper();
for(Customer c:list){
CustomerDto dto=impl.customerToCustomerDto(c);%>


	<tbody>
    <tr>
      <td><%out.println(dto.getUId()); %></td>
      <td><%out.println(dto.getFirstName()); %></td>
      <td><%out.println(dto.getLastName()); %></td>
      <td><%out.println(dto.getEmail()); %></td>
    </tr>
 
  </tbody>
<%}%>




  
</table>
</body>
</html>