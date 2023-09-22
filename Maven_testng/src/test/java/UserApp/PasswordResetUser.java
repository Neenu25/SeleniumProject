package UserApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PasswordResetUser {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver = new ChromeDriver();
		driver.get("https://di6mm4n235un2.cloudfront.net/auth/home");
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	
	public void testcase1() {
		
		driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
		
		driver.findElement(By.xpath("//u[contains(text(),'パスワードをお忘れですか？')]")).click();
		
		driver.findElement(By.xpath("//body/app-root[1]/app-auth[1]/app-forget-password[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("neenu.j@jiitak.com");
		
		
	}
	
	

}
