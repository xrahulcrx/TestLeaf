import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;




public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");	
		
		ChromeDriver driver = new ChromeDriver(options);
		
		
		//access url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize
		driver.manage().window().maximize();
		//enter name

		//Attribute basesd xpath
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");

		//partialAttribute
		driver.findElement(By.xpath("//input[contains(@name, 'PASS')]")).sendKeys("crmsfa");

		//Attribute basesd xpath
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
		Thread.sleep(1*1000);
		//partial text	
		driver.findElement(By.xpath("//a[contains(text(), 'M/SF')]")).click();
		
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//a[contains(text(), 'Find Leads')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


		driver.findElement(By.xpath("//span[contains(text(), 'Phone')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("phoneCountryCode")).sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		driver.findElement(By.name("phoneCountryCode")).sendKeys("9");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("1");
		driver.findElement(By.name("phoneNumber")).sendKeys("979097");
		
		driver.findElement(By.xpath("//button[contains(text(), 'Find')]")).click();
		Thread.sleep(500);
		

		
		
		if(driver.findElements(By.xpath("//div[contains(text(), 'No records to display')]")).size() > 0) {
			System.out.println("No Data Found");
		}else {
			WebElement getlead = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
			String capture = getlead.getText();
			System.out.println(capture);
			
			getlead.click();
			
			driver.findElement(By.className("subMenuButtonDangerous")).click();
			
			
			
			driver.findElement(By.xpath("//a[contains(text(), 'Find Leads')]")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			
			
			driver.findElement(By.xpath("(//input[@name='id'])")).sendKeys(capture);
			driver.findElement(By.xpath("//button[contains(text(), 'Find')]")).click();
			
		    if (driver.findElements(By.xpath("//div[contains(text(), 'No records to display')]")).size() > 0) {
		    	System.out.println("Lead  deleted: " + capture);
		    }
				
		}
		
		
	

	}

}
