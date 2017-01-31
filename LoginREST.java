package res.loginserv;
import org.json.JSONObject;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class LoginREST {

  public String LoginValid(String em, String pass) {
	  String res = null;
	try {

		Client client = Client.create();

		WebResource webResource = client
		   .resource("http://localhost:8080/Ebaycom/login/Poonam?Email="+em+"&Password="+pass);

		ClientResponse response = webResource.accept("application/json")
                   .get(ClientResponse.class);

		if (response.getStatus() != 200) {
		   throw new RuntimeException("Failed : HTTP error code : "
			+ response.getStatus());
		}
		JSONObject js=new JSONObject();
        
		js = response.getEntity(JSONObject.class);
		
		res =  (String) js.get("result");

		

	  } catch (Exception e) {

		e.printStackTrace();

	  }
	return res;

	}
}

