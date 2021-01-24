<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User DashBoard</title>
</head>
<body>


<!-- <form:form method="POST" action="/userdashboard" 
  modelAttribute="area">
    <form:label path="name">Name</form:label>
    <form:input path="name" />
    
    <form:label path="id">Id</form:label>
    <form:input path="id" /> -->
    
   <!--  <input type="submit" value="Submit" /> -->
<!-- </form:form> -->
	

	<form method="POST" action="/userareas">
		<!-- <input type="text" name="areaname" value="area"/><br><br> -->
		<input type="submit" value="Click To Continue" />
				<%-- <c:forEach var="area" items="${userareas}">
					<td>${area.areas}</td>
				</c:forEach> --%>
	<!--   <input type="text" name="areaname" value="area"/><br><br>
	  <input type="submit" name="submit"/>
 -->	</form> 

</body>
</html>