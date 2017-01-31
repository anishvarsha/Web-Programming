package res.loginserv;

import javax.ws.rs.core.MediaType;

import org.json.JSONObject;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class SignupREST {

  public String AddUser(String fname,String lname,String email,String pwd,String faddr,String city,String state,String zip) {
	  String res = null;
	try {
		
		Client client = Client.create();

		WebResource webResource = client
		   .resource("http://localhost:8080/ECommApp/Login/Poonam?Email="+email+"&Fname="+fname+"&Lname="+lname+"&Password="+pwd+"&faddr="+faddr+"&city="+city+"&state="+state+"&zip="+zip);

		ClientResponse response = webResource.path("/").type(MediaType.TEXT_HTML).get(ClientResponse.class);
		res = response.getEntity(String.class);
				

	  } catch (Exception e) {

		e.printStackTrace();

	  }
	return res;

	}
}

