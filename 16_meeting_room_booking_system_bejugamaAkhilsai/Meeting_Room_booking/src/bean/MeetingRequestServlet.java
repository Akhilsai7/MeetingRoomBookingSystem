package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MeetingRequestServlet
 */
@WebServlet("/MeetingRequestServlet")
public class MeetingRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MeetingRequestServlet() {
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
		HttpSession session=request.getSession();  
		String usrname=(String) session.getAttribute("user");
		System.out.println(usrname);
		mb.setUser(usrname);
		mb.setDate(request.getParameter("Dateofbooking"));
		mb.setStart_time(request.getParameter("starttime"));
		mb.setEnd_time(request.getParameter("endtime"));
		int option=Integer.parseInt(request.getParameter("Meetingroom_no"));
		mb.setMR_no(option);
		int option1=Integer.parseInt(request.getParameter("Resource_no"));
		mb.setResource(option1);
		mb.setStatus("NEW");
		int status=UserDAO.MrRequest(mb);
		if(status!=0)
		{
			out.println("Meeting Room request sent");
			out.println("Meeting Room request ID:"+status);
		}
		else
		{
			out.println("Request cannot be Sent");
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
