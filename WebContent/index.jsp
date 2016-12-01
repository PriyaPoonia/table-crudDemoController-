<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.Date" %>
    <%!
    
    String title = "My home page";
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><%= title %></title>
</head>


<body>


<script>

function validate()
{
	var regusername= /^[A-Z]{1}[a-z]{1,}$/;
	var username = document.registration.username.value;
	console.log("username" + username)
	
if(!regusername.test("username"))
	{
	return true;
	}
	return true;
	}

</script>



<%-- This is a java comment --%>
<form name= "registration" on submit ="return Validate()";>
<input type="text" required= "required" name="username"/>
<input  type="submit" value="submit"/>
		
</form>
 <%
String name=request.getParameter("username");  
out.print("welcome ");    //username is not validating
%> 
<br/>
<%

out.println(pageContext.getServletContext().getContextPath());

%>
<%
out.println(new Date());
   %>
  

</body>
</html>