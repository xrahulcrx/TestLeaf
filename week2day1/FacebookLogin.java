import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		//Chrome Initialize
		
		
		ChromeOptions options = new  ChromeOptions();
		options.addArguments("--guest");

		
		ChromeDriver driver = new ChromeDriver(options);

		//facebook login
		
		driver.get("https:www.facebook.com");
		driver.manage().window().maximize();
		  
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();

		//get title
		
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();

	}

}
