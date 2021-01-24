<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
</head>
<body>

 Add New Areas:
 
 <br/>
 Enter The new Area Name:
 
 <form method="GET" action="/areas">
	  <input type="text" name="areaname" value="area"/><br><br>
	
	<input type="submit" name="submit"/>
</form> 

</body>
</html>