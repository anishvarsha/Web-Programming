package res.loginserv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Biddingdoneserv
 */
public class Biddingdoneserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Biddingdoneserv() {
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
		String bidId=request.getParameter("bidId");
		String userId=request.getParameter("userId");
		String name=request.getParameter("name");
		String price=request.getParameter("price");
		String result = new BiddingdoneREST().Approve(bidId);
		for (String item: result.split("=")) {
			String[] temp = item.split(":");
			
			if(!temp.equals(null))
				{//System.out.println(temp[0]);
			//System.out.println(temp[1]);
				request.setAttribute(temp[0], temp[1]);
				}
			else 
				break;
			}
		request.setAttribute("name", name);
		request.setAttribute("price", price);
		request.setAttribute("userId", userId);
		
		
		// Recipient's email ID needs to be mentioned.
	      String to = "chandanavarada9@gmail.com";
	 
	      // Sender's email ID needs to be mentioned
	      String from = "web@gmail.com";
	 
	      // Assuming you are sending email from localhost
	      String host = "localhost";
	 
	      // Get system properties
	      Properties properties = System.getProperties();
	 
	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);
	 
	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);
	      
		  // Set response content type
	      response.setContentType("text/html");
	      PrintWriter out = response.getWriter();

	      try{
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);
	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));
	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO,
	                                  new InternetAddress(to));
	         // Set Subject: header field
	         message.setSubject("This is the Subject Line!");

	         // Send the actual HTML message, as big as you like
	         message.setContent("<h1>This is actual message</h1>",
	                            "text/html" );
	         // Send message
	         Transport.send(message);
	      }catch (MessagingException mex) {
	          mex.printStackTrace();
		
		RequestDispatcher rd=(RequestDispatcher) getServletContext().getRequestDispatcher("/Biddone.jsp");	
		rd.forward(request,response);
		
	}

}
}
