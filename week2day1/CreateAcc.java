import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class CreateAcc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Chrome Initialize
		
		ChromeOptions options = new  ChromeOptions();
		options.addArguments("--guest");

		
		ChromeDriver driver = new ChromeDriver(options);
		
		//website and maximize
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		Thread.sleep(2*1000);
		
		//inputs
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//login
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		
		//accounts create
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("TestSeleniumC");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.id("officeSiteName")).sendKeys("Leaftaps");
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("25");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle());
		
		
		Thread.sleep(8*1000);
		driver.close();

		
		
		
	}

}
