<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%!
    
    String title = "My home page";
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><%=title %></title>
</head>
<body>


<form action="welcome.jsp">  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  

</form>
  <script>
function myFunction() {
    text = document.getElementById("p01").innerHTML; 
    document.getElementById("demo").innerHTML = /e/.test(text);
}
</script>




</body>
</html>