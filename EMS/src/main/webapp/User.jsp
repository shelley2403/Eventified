<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.system.ems.pojo.*"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%HttpSession session1 = request.getSession();
	String name=(String)session1.getAttribute("firstName");
	User userReturned=(com.system.ems.pojo.User)session1.getAttribute("userReturned");
	
	
	%>Hello <%=name%>
	
	<%HttpSession session5 = request.getSession();
	ArrayList<Notification> notifications=(ArrayList<Notification>)session5.getAttribute("notiList");
	%>

	VIEW NOTIFICATIONS:
	
	
	<ul class="messages">
		
		<c:forEach var="notifications" items="<%= notifications%>">
		<c:if test="${notifications!=null}">
		
        <li>
       		<div><strong>${notifications.friendId}</strong></div>
                 <div>${notifications.description}</div>
        </li>
        </c:if>
		</c:forEach>
                        
    </ul>
    
    <BR/>
    
    
    INVITE FRIENDS TO YOUR NETWORK:
    <form action="searfri.htm" method="get">
    <input type="text"  name="searchfrns" name="searchfrns" onfocus="clear(this);"/>
    <input type = "submit" value="Search">
    </form>
    
    
    
    
    

	CREATE NEW EVENT:
	<form action="qwe.htm" method="post">
	<label for="eventitle">Event Title<input type ="text" id="eventitle" name = "eventitle" /></label><br/>
	<label for="eventype">Event Type<input type ="text" id="eventype" name = "eventype" /></label><br/>
	<label for="eventdesc">Event Description<input type ="text" id="eventdesc" name = "eventdesc" /></label><br/>
	<label for="eventdate">Event Date<input type ="text" id="eventdate" name = "eventdate" /></label><br/>
	<label for="eventime">Event Starts At<input type ="text" id="eventime" name = "eventime" /></label><br/>
	
	Venue Details:-
	
	<label for="eventvenue">Event Venue<input type ="text" id="eventvenue" name = "eventvenue" /></label><br/>
	<label for="venuelocation">Venue Location<input type ="text" id="venuelocation" name = "venuelocation" /></label><br/>
	
	<input type = "submit" value="Create Event">
	</form>
	
	
	SEND A FRIEND REQUEST:
	<form action="lsd.htm" method="get">
	Invitee's Name: <input type ="text" id= "friendId" name = "friendId" />
	<input type = "submit" value="Invite">
	</form>

</body>
</html>