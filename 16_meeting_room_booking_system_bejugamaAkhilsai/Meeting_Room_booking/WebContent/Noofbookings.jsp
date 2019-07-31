<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>No of bookings</title>
</head>
<body style="background-color:skyblue;">

<%@include file="FacilityManagerFunc.jsp" %>
<form style="text-align:center" method="post" >
<% out.print("No of bookings for MeetingRoom no"+request.getAttribute("room") +" are:"+ request.getAttribute("status")); %>
</form>
</body>
</html>