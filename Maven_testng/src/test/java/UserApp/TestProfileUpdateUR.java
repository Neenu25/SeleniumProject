package UserApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestProfileUpdateUR {
	
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() throws InterruptedException {
		
			driver = new ChromeDriver();
			driver.get("https://di6mm4n235un2.cloudfront.net/auth/home");
			driver.manage().window().maximize();
	
			
			driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan10@gmail.com");
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Subha@123");
			driver.findElement(By.xpath("//button[@class='submit-button']")).click();
			
			Thread.sleep(4000);
			
	}
	
	
	
		
	
	
	
	
	@Test
	
	public void testcase2() {
			
			
			driver.findElement(By.xpath("//div[@class='user-detail']/div/img")).click();	
	
	
			//driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-settings/div/app-user-profile/div/div[2]/form/div/div[1]/input")).clear();
			driver.findElement(By.xpath("//button[@class='change-password-button']")).click();
		
			
			
			
		
			
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-change-password/div/div/form/div/div[1]/input")).sendKeys("Subha@123");
			driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-change-password/div/div/form/div/div[2]/input")).sendKeys("Password@123");
			driver.findElement(By.xpath("//button[@class='update-btn']")).click();
			driver.findElement(By.xpath("//button[@class='save-change-button']")).click();
			
			
			
			driver.findElement(By.xpath("//h3[@class='log-out']")).click(); //logout
			
			
			
			
			//login
			

			driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan10@gmail.com");
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Password@123");
			driver.findElement(By.xpath("//button[@class='submit-button ng-star-inserted']")).click();
			
			
			
					
	}
	
	

	
	
}
