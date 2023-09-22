package UserApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchUser {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://di6mm4n235un2.cloudfront.net/auth/home");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan10@gmail.com");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Subha@123");
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
	}

	@Test
	
	public void testcases() {
		
		driver.findElement(By.xpath("//div/div[@class='search']/input")).sendKeys("789");
		//driver.findElement(By.xpath("")).click();
		
		
	}
	
	
	
}
