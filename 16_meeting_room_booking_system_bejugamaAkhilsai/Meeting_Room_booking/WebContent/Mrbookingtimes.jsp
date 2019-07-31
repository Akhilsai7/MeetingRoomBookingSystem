<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<marquee direction="right" scrollamount="12"  behavior="scroll">MEETING ROOM BOOKING SYSTEM</marquee>
<meta charset="ISO-8859-1">
<title>Meeting Room bookings in a Month</title>
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
<h2 align="center" >No of Requests in A Month</h2>
<form name="NoofRequests" style="text-align:center" method="post" action="MrBookingtimesServlet">
<table align="center">
<tr><td>Meeting Room No:</td><td><input type="number" name="room" value=""></td></tr>
<td><input type="submit" name="index_validate" value="submit"></td></tr>
</table>
</form>
</body>
</html>