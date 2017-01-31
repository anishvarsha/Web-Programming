package res.loginserv;

import javax.ws.rs.core.MediaType;

import org.json.JSONObject;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class SearchREST {
	
	public String search(String str) {
		  String res = null;
		try {
			JSONObject js=new JSONObject();
			Client client = Client.create();

			WebResource webResource = client
			   .resource("http://localhost:8080/ECommApp/Login/Poonam?search="+str);

			ClientResponse response = webResource.path("/").type(MediaType.TEXT_HTML).get(ClientResponse.class);
			res = response.getEntity(String.class);

		  } catch (Exception e) {

			e.printStackTrace();

		  }
		return res;

		}

}
