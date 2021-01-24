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
	Rating has been successfully added to the records!

	<table>

		<c:forEach var="rating" items="${UserRating}">

			<tr>
				<td>${rating.area}</td>
				<td>${rating.rating}</td>
			<tr>
		</c:forEach>
	</table>

</body>
</html>