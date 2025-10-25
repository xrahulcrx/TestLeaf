import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {

		
		ChromeOptions options = new  ChromeOptions();
		options.addArguments("--guest");

		
		ChromeDriver driver = new ChromeDriver(options);
		//get url
		driver.get("https:www.facebook.com");
    //maximize
		driver.manage().window().maximize();

    //dummy variables
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
