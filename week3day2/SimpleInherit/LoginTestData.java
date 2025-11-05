package week3day2Simple;

public class LoginTestData extends TestData{
	
	
	public void enterUsername() {
		
		System.out.println("From LoginTestData enterUsername");
		
	}
	
	public void enterPassword() {
		
		System.out.println("From LoginTestData enterPassword");
	}
	
	public static void main(String[] args) {
		
		LoginTestData ltd = new LoginTestData();
		
		ltd.enterCredentials();
		ltd.navigateToHomePage();
		ltd.enterUsername();
		ltd.enterPassword();
	}

}
