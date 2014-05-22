import javax.xml.ws.Endpoint;


public class ServerMain {
	public static void main(String[] args){
		
		HelloWorld hw=new HelloWorldWs();
		
		//调用Endpoint的publish方法发布web service
		Endpoint.publish("http//192.168.1.160/wzz", hw);
		System.out.println("web service暴漏成功");
		
	}
	

}
