package res.loginserv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Updateprofileserv
 */
public class Updateprofileserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updateprofileserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String userId=request.getParameter("userId");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String caddr=request.getParameter("caddr");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		new UpdateprofileREST().Update(userId,fname,lname,caddr,email,phone);
		request.setAttribute("userId", userId);
		RequestDispatcher rd=(RequestDispatcher) getServletContext().getRequestDispatcher("/Updatesuccess.jsp");	
		rd.forward(request,response);
		
	}

}
