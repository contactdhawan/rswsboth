package sf.ecrm.firstws.firstws_svc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import sf.ecrm.firstws.firstws_svc.RestClassInterface;

public class RestClass implements RestClassInterface {

	
	public Response sayRestHello()  {
		HelloWorld hello = new HelloWorld();
		hello.setHello("Hello World");
		return  Response.ok(hello).build();
	}

}
