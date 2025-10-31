import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLeads {

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
		//
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rahul");
		//
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("TestS");
		//Source Dropdown Select
		WebElement SourceSel = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel1 = new Select(SourceSel);
		sel1.selectByIndex(4);
		//
		WebElement IndSel = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sel2 = new Select(IndSel);
		sel2.selectByValue("IND_NON_PROFIT");
		//createLeadForm_ownershipEnumId
		WebElement OwnSel = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sel3 = new Select(OwnSel);
		sel3.selectByVisibleText("Public Corporation");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5*1000);
		
		driver.close();


	}

}
