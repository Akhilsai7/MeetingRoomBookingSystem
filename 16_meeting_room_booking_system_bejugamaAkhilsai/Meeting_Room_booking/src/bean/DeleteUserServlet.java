package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteUserServlet
 */
@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletRequest session;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		Adminbean ab=new Adminbean();
		ab.setUser(request.getParameter("user"));
		boolean status=FMDAO.DeleteUser(ab);
		 if(status==true)
		 {
			
			 //String message="Successfully Deleted User!";
			out.println("Successfully Deleted User "+request.getParameter("user"));
			 //response.sendRedirect("DeleteUser.jsp?message=" +message);
			// session.setAttribute("message","successful");
			 //response.sendRedirect("Deleteuser.jsp");
			
			
		 }
		 else if(status==false)
		 {
			// String message1="Cannot Delete User";
			// response.sendRedirect("DeleteUser.jsp?message=" +message1);
			 //session.setAttribute("message",message1);
			// response.sendRedirect("Deleteuser.jsp");
			 out.println("Cannot Delete user"+request.getParameter("user"));
			
		 }
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
