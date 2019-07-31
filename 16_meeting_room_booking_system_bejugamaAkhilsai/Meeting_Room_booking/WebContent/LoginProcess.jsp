<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="bean.LoginDao"%>  
<jsp:useBean id="obj" class="bean.LoginBean"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
String Usrname=(String)request.getParameter("userid");
String Password=(String)request.getParameter("pwd");
obj.setName(Usrname);
obj.setPass(Password);

session.setAttribute("user", Usrname);
request.setAttribute("obj", obj);
RequestDispatcher rd=request.getRequestDispatcher("LoginServlet");
rd.forward(request,response);


%>  
 