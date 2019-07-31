<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Request Meeting Room</title>
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
<%@include file="UserFunc.jsp" %>
<form name="Newrequest" style="text-align:center" method="post" action="MeetingRequestServlet">
<h2 align="center" >Request A Meeting Room</h2>
<table align="center" >
<tr><td>Date of Booking:</td><td><input type="date" name="Dateofbooking" value=""></td></tr>
<tr><td>Start time:</td><td><input type="time" name="starttime" value=""></td></tr>
<tr><td>End time:</td><td><input type="time" name="endtime" value=""></td></tr>
Meeting Room No:<select name="Meetingroom_no">
	  <option value=0>(Default)</option>
	  <option value=1>Meeting Room1</option>
	  <option value=2>Meeting Room2</option>
	  <option value=3>Meeting Room3</option>
	</select><br>
	
Resource required:<select name="Resource_no">
	  <option value=0>(Default)</option>
	  <option value=1>Projector</option>
	  <option value=2>Whiteboard</option>
	  <option value=3>Speakers</option>
	</select><br>
	
	
	
</table>
<input type="submit" name="SUBMIT" value="submit">
</form>
</body>
</html>