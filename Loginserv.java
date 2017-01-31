package res.loginserv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Loginserv
 */
public class Loginserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
		String em=request.getParameter("email");
		String pa=request.getParameter("pass");
		String result=new LoginREST().LoginValid(em,pa);
		//String result= "chandana";
		if(result.equals("false"))
		{
			request.setAttribute("result", result);
			RequestDispatcher rd=(RequestDispatcher) getServletContext().getRequestDispatcher("/Java Resources/src/main/webapp/LoginFail.jsp");	
			rd.forward(request,response);
		}
		else
		{
			Cookie crunchifyCookie = new Cookie("userid", result);
            // setting cookie to expiry in 60 mins
            crunchifyCookie.setMaxAge(60 * 60);
            response.addCookie(crunchifyCookie);
            response.sendRedirect("Loginwelcome.jsp");
		}
		
	}

}
