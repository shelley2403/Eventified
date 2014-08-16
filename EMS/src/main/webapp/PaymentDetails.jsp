<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.system.ems.pojo.TicketType"%>
    <%@page import="java.util.ArrayList"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="tictypes" items= "${ticketDetailsList}">
	<c:if test="${tictypes!=null}">
	<ul>
	<li> ${tictypes.ticketName}</li>
	 <li>${tictypes.price} </li>
		<li>${tictypes.quantity}  </li>
		<li>Sum: ${tictypes.price} * ${tictypes.quantity}</li>
	</ul>
	
	</c:if>
	</c:forEach>
</body>
</html>