package week5day1HA;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FramesCheck {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options =  new ChromeOptions();
		
		options.addArguments("--guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[contains(text(), 'Try')]")).click();
		
		Random rand = new Random();
		int n = rand.nextInt(2);
		
		Alert alt = driver.switchTo().alert();
		
		if (n == 0) {
			alt.accept();
		}else {
			alt.dismiss();
		}
		
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		
		Thread.sleep(5000);
		driver.close();
	}

}
