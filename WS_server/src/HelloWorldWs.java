import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface="HelloWorld",serviceName="HelloWorldWS")
public class HelloWorldWs implements HelloWorld {

	@Override
	public String sayHI(String name) {
		
		return name+"您好，现在的时间是"+new Date();
	}

}
