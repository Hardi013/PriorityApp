<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	User Areas

<form method="POST" action="/userRating">

	<table>
		<tr>
	
			<c:forEach var="area" items="${userareas}">

				<td>${area.areas}</td>
				
				<td width="20px">
	<input  type="text" name="${area.areas}" value="0"/></td>
					
			</c:forEach>
				
		</tr>
	</table>
	<input type="submit" name="submit"/>
	
	
	
	<%-- <c:forEach var="entry" items="${userareas}">
                <tr><td><c:out value="${entry.key}"/></td> <td><c:out value="${entry.value}"/> </td></tr>
            </c:forEach> --%>
	
	
	
	
	

	
	
	
	
	
	</form>
</body>
</html>