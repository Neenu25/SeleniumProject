package UserApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogoutUR {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		driver.get("https://di6mm4n235un2.cloudfront.net/auth/home");
		driver.manage().window().maximize();
	}

	
	@Test
	
	public void testcase1() throws InterruptedException {
		//login
		driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan10@gmail.com");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Subha@123");
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		Thread.sleep(3000);	
		
		 driver.findElement(By.xpath("//div[@class='user-detail']/div/img")).click();
		 driver.findElement(By.xpath("//h3[@class='log-out']")).click();
		
		
		
	}
}
