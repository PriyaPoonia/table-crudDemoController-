<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ page import="java.util.List, com.niit.entity.Employee" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>



<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

List<Employee> employees = (List<Employee>)request.getAttribute("employees");

%>

<table border = "1" width ="80%" align ="center">

<caption>Employee Details</caption>
<thead>
<tr>
		<th>FirstName</th>
		<th>LastName</th>
		<th>salary</th>
		<th>Working</th>
		<th> &#160;</th>
		
</tr>
</thead>

<tbody>

<%
for(Employee employee : employees)
{
%>
<tr>
	<td><%= employee.getFirstName() %></td>
	<td><%= employee.getLastName() %></td>
	<td><%= employee.getSalary() %></td>
	<td><%= employee.isWorking() %></td>
	<td>
				<a href="EmployeeController.do?action=edit&id=<%= employee.getId()%>">Edit</a>
					<a href="EmployeeController.do?action=delete&id=<%= employee.getId()%>">Delete</a>
 		</td>		
 				
 	</tr>					
<%
}
%>

	
</tbody>
      <tfoot>
		<tr>
 				<td colspan="5">
 					<a href="EmployeeController.do?action=insert">Add Employee</a>	
 				</td>
 			</tr>
 		
 	</tfoot>	
</table>
</body>
</html>	