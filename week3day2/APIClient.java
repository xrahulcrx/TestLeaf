public class APIClient {
	
	public void sendRequest(String text) {
		System.out.println(" One Argument String "+text);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		
		if(requestStatus) {
			System.out.println("The request status is true, so endpoint text : "+endpoint+" and requestBody text : "+requestBody);
		}else {
			System.out.println("The request status is false");
		}
		
	}
	
	public static void main(String[] args) {
		APIClient apic = new APIClient();
		
		apic.sendRequest("Hellow World");
		apic.sendRequest("The start", "The end", true);
		apic.sendRequest("The end", "The start", false);
	}

}
