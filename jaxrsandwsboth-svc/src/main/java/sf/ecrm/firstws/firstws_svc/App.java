package sf.ecrm.firstws.firstws_svc;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Hello world!
 *
 */
@WebService
public class App 
{
	@WebMethod
    public String helloWorld(){
    	return "Hello world!!!";
    }
}
