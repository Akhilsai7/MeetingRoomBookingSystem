<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<marquee direction="right" scrollamount="12"  behavior="scroll">MEETING ROOM BOOKING SYSTEM</marquee>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
        background-image: url("https://images.unsplash.com/photo-1557682233-43e671455dfa?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
      	 height: 500px; 
  background-position: center; 
  background-repeat: no-repeat;
   background-size: cover;
} 
 
</style>
</head>
<body style="background-color:skyblue;">
<h2 align="center" >User Functionalities</h2>
<form>
<table align="center">
<tr><td><a href="RequestMeetingroom.jsp"><input type="button" name="Request" value="Request meeting Room"></a></td></tr>  
<tr><td><a href="CancelMeetingroom.jsp"><input type="button" name="Cancel" value="Cancel meeting Room"></a></td></tr> 
</table>
</form>
</body>
</html>