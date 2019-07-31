<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>no of request in a day</title>
</head>
<body style="background-color:skyblue;">
<%@include file="FacilityManagerFunc.jsp" %>
<form style="text-align:center" method="post" >
<% out.print("No of Requests on a given day are:"+ request.getAttribute("status")); %>
</form>
</body>
</html>