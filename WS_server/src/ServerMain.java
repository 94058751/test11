import javax.xml.ws.Endpoint;


public class ServerMain {
	public static void main(String[] args){
		
		HelloWorld hw=new HelloWorldWs();
		
		//����Endpoint��publish��������web service
		Endpoint.publish("http//192.168.1.160/wzz", hw);
		System.out.println("web service��©�ɹ�");
		
	}
	

}
