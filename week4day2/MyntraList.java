package week4day1HA;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraList {
	
	public static void main(String[] args) throws InterruptedException {

		//chrome options initialize
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");

		//driver
		ChromeDriver driver  = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//search
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("bags" + Keys.ENTER);
		
		//passing and selecting arguments
		passLocate(driver, By.xpath("//label[contains(@class,'gender-label') and normalize-space(.)='Men']"));
		Thread.sleep(1000);
		passLocate(driver, By.xpath("//label[contains(@class, 'customCheckbox') and contains(normalize-space(.), 'Laptop Bag')]"));
		Thread.sleep(1000);

		//list to get webelements
		List<WebElement> brandNames = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		List<WebElement> productTitle = driver.findElements(By.xpath("//h4[@class='product-product']"));

		//set for unique
		Set<String> brandNamesUnique = new HashSet<>();
		Set<String> productTitleUnique = new HashSet<>();

		//passing brand names to set
		for (WebElement each : brandNames) {
			
			brandNamesUnique.add(each.getText());
			
		}

		//passing unique titles to set
		for (WebElement each : productTitle) {
			
			productTitleUnique.add(each.getText());
			
		}
		
		//printing brand names
		System.out.println("Brand Count with Duplicates :" +brandNames.size()+ " and Brand Count without Duplicates :" +brandNamesUnique.size());
		System.out.println("List of Brand Names:");
		
		
		for (String each : brandNamesUnique) {
			
			System.out.println(each);
			
		}
		
		//printing titles
		System.out.println("\nProduct Titles Count with Duplicates :" +productTitle.size()+ " and Product Titles Count without Duplicates :" +productTitleUnique.size());
		System.out.println("List of Product Titles: ");
		
		for (String title : productTitleUnique) {
			System.out.println(title);
			
		}
			
	}
	
	//argument locator passing menthod	
	public static void passLocate(ChromeDriver driver, By locator) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
	    element.click();
	    }


}
