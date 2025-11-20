package week5day1HA;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FinanceCheck {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions act = new Actions(driver);
		
		driver.get("https://finance.yahoo.com");
		
		WebElement getMore = driver.findElement(By.xpath("//button[.//span[normalize-space()='More']]"));
		act.moveToElement(getMore).perform();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[contains(@aria-label, 'Crypto')]")).click();
		
		Thread.sleep(500);
		
		List<WebElement> crpytoNames = driver.findElements(By.xpath("(//table//tr/td[2]/div)")); 
		
		System.out.println("List of Crypto Company Names: ");
		
		for (WebElement each : crpytoNames) {
			
			System.out.println(each.getText());
			
		}
		
		
		driver.close();

		
	}
}
