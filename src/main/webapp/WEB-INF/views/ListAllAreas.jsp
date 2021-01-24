<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Areas</title>
</head>
<body>

	<div align="center">
		<table border="10px">
			<tr>
				<td>List of Areas</td>
			</tr>

			<tr>


				<c:forEach var="area" items="${areas}">
					<td>${area.areas}</td>
				</c:forEach>

			</tr>

		</table>
	</div>
	<%-- <h1>${areas}</h1> --%>

</body>
</html>