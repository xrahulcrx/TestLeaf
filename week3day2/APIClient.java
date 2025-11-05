public class APIClient {
	
	public void sendRequest(String text) {
		System.out.println(" One Argument String "+text);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		
		if(requestStatus) {
			System.out.println("The request status is true,  endpoint : "+endpoint+" and requestBody : "+requestBody);
		}else {
			System.out.println("The request status is false");
		}
		
	}
	
	public static void main(String[] args) {
		APIClient apic = new APIClient();
		
		apic.sendRequest("Hellow World");
		apic.sendRequest("192.168.1.10", "plain text", true);
		apic.sendRequest("192.168.1.1", "JSON", false);
	}

}
