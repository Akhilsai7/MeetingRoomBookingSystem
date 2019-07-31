<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<marquee direction="right" scrollamount="12"  behavior="scroll">MEETING ROOM BOOKING SYSTEM</marquee>
<meta charset="ISO-8859-1">
<title>Login Page</title>
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
<form name="index" style="text-align:center" method="post" action="LoginProcess.jsp">  
<h2 align="center" >MRB System Login</h2>
<table align="center">
<tr><td>User name:</td><td><input type="text" name="userid" value=""></td></tr>
<tr><td>Password:</td><td><input type="password" name="pwd" value=""></td></tr>
<tr><td><input type="reset" name="index_clear" value="Clear"></td>
<td><input type="submit" name="index_validate" value="submit"></td></tr>
</table>
</form>  
</body>
</html>