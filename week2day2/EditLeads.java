import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLeads {

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
			//linktext
			driver.findElement(By.linkText("Leads")).click();
			//Create Lead
			driver.findElement(By.linkText("Create Lead")).click();
			
			
			//Details
			driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Testleaf1");
			//
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("RahulEdit");
			//
			driver.findElement(By.xpath("(//input[@class='inputBox'])[4]")).sendKeys("TestS");
			
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Jojo");
			
			
			//department and description field
			
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("HR Department");
			
			driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Create Lead to Edit data in the HR");
			
			
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rahulcr5537@gmail.com");
			
			WebElement SourceSel = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			
			Select sel1 = new Select(SourceSel);
			
			sel1.selectByVisibleText("New York");
			
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			
			Thread.sleep(6000);
			
			driver.findElement(By.linkText("Edit")).click();
			

			
			
			driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).clear();
			
			driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Cleared the text in Description and added in Important Note	");
			
			

			driver.findElement(By.xpath("//input[@value='Update']")).click();
			
			
			System.out.println(driver.getTitle());
			
			Thread.sleep(5*1000);
			
			driver.close();
			
			
		}
		
}
