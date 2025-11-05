package week3day2_Poly;

public class LoginPage extends BasePage{
	
	
	@Override
	public void performCommonTasks() {
		System.out.println("Child Class Login page performCommonTasks");
	}
	
	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		lp.performCommonTasks();
		
	}

}
