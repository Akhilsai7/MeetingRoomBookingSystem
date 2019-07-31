package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MrBookingtimesServlet
 */
@WebServlet("/MrBookingtimesServlet")
public class MrBookingtimesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MrBookingtimesServlet() {
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
		MRbean mb=new MRbean();
	
		mb.setMR_no(Integer.parseInt(request.getParameter("room")));
		int status=FMDAO.Noofbookings(mb);
		if(status!=0)
		{
			
			RequestDispatcher rd=request.getRequestDispatcher("Noofbookings.jsp"); 
			request.setAttribute("status",status);
			request.setAttribute("room", request.getParameter("room"));
			rd.forward(request,response);
			//out.println("No of requests in a Day"+status);
		}
		else
		{
			out.println("No requests today");
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
