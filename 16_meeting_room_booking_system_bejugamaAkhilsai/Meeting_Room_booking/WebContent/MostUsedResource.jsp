<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Most Used Resource</title>
</head>
<body style="background-color:skyblue;">
<%@include file="FacilityManagerFunc.jsp" %>
<form style="text-align:center" method="post" >
<%int status=(int)request.getAttribute("status");
if(status==1)
{
	out.println("The most utilised resource is projector");
}
if(status==2)
{
	out.println("The most utilised resource is Whiteboard");
}
if(status==3)
{
	out.println("The most utilised resource is speakers");
}
%>
</form>
</body>
</html>