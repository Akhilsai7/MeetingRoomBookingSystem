package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ApproveRejectServlet
 */
@WebServlet("/ApproveRejectServlet")
public class ApproveRejectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Object approve_reject;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApproveRejectServlet() {
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
		MRbean mr=new MRbean();
		mr.setId(Integer.parseInt(request.getParameter("requestid")));
		String operation=(request.getParameter("approve_reject"));
	
		int flag=0;
		if(operation.equals("approverequest"))
		{
			flag=1;
			boolean status=FMDAO.ApproveReject(mr,flag);
			if(status==true)
			{
				out.println("Approve ID:"+request.getParameter("requestid"));
			}
			else
			{
				out.println("cannot Approve");
			}
		
			
		}
		else if(operation.equals("rejectrequest"))
		{
			flag=2;
			out.println("Hello");
			boolean status=FMDAO.ApproveReject(mr,flag);
			if(status==true)
			{
				out.println("rejected ID:"+request.getParameter("requestid"));
			}
			else
			{
				out.println("cannot Reject");
			}
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
