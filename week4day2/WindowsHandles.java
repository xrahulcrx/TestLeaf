	package week4day1HA;
	
	import java.time.Duration;
	import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	
	public class WindowsHandles {
		
		public static void main(String[] args) throws InterruptedException {
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--guest");
			
			
			ChromeDriver driver = new ChromeDriver(options);
			
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			
			
			driver.findElement(By.xpath("//a[contains(text(), 'CRM')]")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")).click();
			
			driver.findElement(By.xpath("//a[contains(text(), 'Merge Contacts')]")).click();
			
			
			
			String parent = driver.getWindowHandle();
			
			driver.findElement(By.xpath("(//table[contains(text(), dijit )]/following-sibling::a)[1]")).click();
			
			Thread.sleep(1000);
			
			Set<String> allWindows = driver.getWindowHandles();
			
			for(String win: allWindows) {
				if(!win.equals(parent)) {
					driver.switchTo().window(win);
				}
			}
					
			
			driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
			
			
			driver.switchTo().window(parent);
			
			
	
			
			
			driver.findElement(By.xpath("(//table[contains(text(), dijit )]/following-sibling::a)[2]")).click();
			
			Thread.sleep(1000);
			
	        Set<String> allWindows2 = driver.getWindowHandles();
			
			for(String win: allWindows2) {
				if(!win.equals(parent)) {
					driver.switchTo().window(win);
				}
			}
			
			driver.findElement(By.xpath("//div[contains(@class, 'x-grid3-row')][2]//table//tr/td[1]//a")).click();
			
			driver.switchTo().window(parent);
			
			driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
			
			
			Alert alt = driver.switchTo().alert();
			alt.accept();
	
			System.out.println(driver.findElement(By.id("sectionHeaderTitle_contacts")).getText());
			
		}
	
	}
