import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface="HelloWorld",serviceName="HelloWorldWS")
public class HelloWorldWs implements HelloWorld {

	@Override
	public String sayHI(String name) {
		
		return name+"���ã����ڵ�ʱ����"+new Date();
	}

}
