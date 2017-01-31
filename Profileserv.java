package res.loginserv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Profileserv
 */
public class Profileserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Profileserv() {
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
		//String result=new ProfileREST().Fetch(userId);
		String result= "fname:chandana=lname:varada=email:hai@hu.com=caddr:gyh 2 huj=phone:1234=date:12-13-29=time:12:30=location:texas";
int count=0;
		
		for (String item: result.split("=")) {
			String[] temp = item.split(":");
			count++;
			if(!temp.equals(null))
				request.setAttribute(temp[0], temp[1]);
			else 
				break;
			
	      }
		count=count/7;
		
		request.setAttribute("count", count);
		request.setAttribute("userId", userId);
		RequestDispatcher rd=(RequestDispatcher) getServletContext().getRequestDispatcher("/Profiledetails.jsp");	
		rd.forward(request,response);
		
		
		
	}

}
