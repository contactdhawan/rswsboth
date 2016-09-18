package sf.ecrm.firstws.firstws_svc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Produces("application/json")
public interface RestClassInterface {
	@GET
	@Path("/hello")
	public Response sayRestHello();
}
