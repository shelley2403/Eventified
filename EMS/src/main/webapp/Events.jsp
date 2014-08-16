<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	
	Event News :
	<form action= "attendEvent.htm" method="get">
	<table border="1">
	<caption>What's happening around!</caption>
	<thead>
		<tr>
		<th>Event Title:</th>
		<th>Event Description</th>
		<th></th>
		</tr>
	</thead>
	<tbody>
	<tr>

	<c:forEach var="eventDirectory" items="${eventDetails}">

	<c:if test="${eventDirectory!=null}">
	
	<td> ${eventDirectory.title} <input type="hidden" name="eventId" value="${eventDirectory.eventId}"></td>
	<td> ${eventDirectory.description} </td>
	<td><input type ="submit" value = Attend /></td>
	
	</c:if>
	</c:forEach>
	</tr>
	</tbody>

</table>
</form>
	

</body>
</html>