<%@page import="com.system.ems.pojo.Event"%>
<%@page import="com.system.ems.pojo.TicketType"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	HttpSession session3 = request.getSession();
	Event e = (Event)session3.getAttribute("eventDetails");
	session3.setAttribute("e",e);
	ArrayList<TicketType> ticketNameList= (ArrayList<TicketType>) session3.getAttribute("tt");
	int i = 0;
	%>

	
	
	<%=e.getTitle() %>
	Ticket Details for Event at:<%=e.getStartDate() %>at<%=e.getStartTime() %>

	<form action= "ProcessTicketing.htm" method="post">
	<table border="1">
	<caption>Please select ticket / registration type to proceed...</caption>
	<thead>
		<tr>
		<th>Ticket Type</th>
		
		<th>Price</th>
		<th>Quantity</th>
		</tr>
	</thead>
	<tbody>
	

	<c:forEach var="tictypes" items="<%= ticketNameList%>">
	<c:if test="${tictypes!=null}">
	<%i++;%> 
	<tr>
	<td> ${tictypes.ticketName} <input type="hidden" id="ttype" name="ttype<%= i%>" value="${tictypes.ticketName}"></td>
	<td> ${tictypes.price}  <input type="hidden" id="tprice" name="tprice<%= i%>" value="${tictypes.price}"></td>
	<td><input type="text" id="purchaseQnty" name="purchaseQnty<%= i%>"></td>
	
	</tr>
	</c:if>
	</c:forEach>
	
	<tfoot>
	
	<tr><td colspan="4"><input type ="submit" value = "MakePayment" /><input type="hidden" id="valueOfi" name="valueOfi" value="<%=i%>"></td></tr></tfoot>
	</tbody>
</table>
</form>

</body>
</html>