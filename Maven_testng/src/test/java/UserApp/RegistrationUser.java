package UserApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationUser {
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver = new ChromeDriver();
		driver.get("https://di6mm4n235un2.cloudfront.net/auth/home");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='submit-button margin']")).click();
		
	}
	
	@Test
	
	public void testcase1() {
		
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-registration/div/div/div[2]/div/div[1]/form/div/div[1]/input")).sendKeys("Neenu");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-registration/div/div/div[2]/div/div[1]/form/div/div[2]/input")).sendKeys("subhaganeshan10@gmail.com");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-registration/div/div/div[2]/div/div[1]/form/div/div[3]/input")).sendKeys("Subha@123");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-registration/div/div/div[2]/div/div[1]/form/div/div[4]/input")).sendKeys("Subha@123");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-registration/div/div/div[2]/div/div[2]/mat-checkbox/label/div")).click();
	}
	
	
	
	
	
	
	

}
