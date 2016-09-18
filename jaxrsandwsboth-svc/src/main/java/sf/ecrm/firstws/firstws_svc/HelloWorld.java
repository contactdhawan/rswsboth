package sf.ecrm.firstws.firstws_svc;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
class HelloWorld{
	public String hello;

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	
}
