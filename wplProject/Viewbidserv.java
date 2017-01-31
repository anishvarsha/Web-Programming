package res.loginserv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Viewbidserv
 */
public class Viewbidserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Viewbidserv() {
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
		String result=new ViewbidREST().getItems(userId);
		
int count=0;
		
		for (String item: result.split("=")) {
			String[] temp = item.split(":");
			count++;
			if(!temp.equals(null))
				{//System.out.println(temp[0]);
			//System.out.println(temp[1]);
				request.setAttribute(temp[0], temp[1]);
				}
			else 
				break;
			
	      }
		count=count/4;
		
		
		//System.out.println(count);
		request.setAttribute("count", count);
		request.setAttribute("userId", userId);
		
		RequestDispatcher rd=(RequestDispatcher) getServletContext().getRequestDispatcher("/Viewbid.jsp");	
		rd.forward(request,response);
		
	}

}
