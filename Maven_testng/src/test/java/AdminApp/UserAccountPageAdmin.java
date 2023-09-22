package AdminApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserAccountPageAdmin {
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://admin-panel-staging-ebay.s3-website-ap-northeast-1.amazonaws.com/auth/home");
		driver.manage().window().maximize();
		
		
		
		
		
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("rosemary@stunntech.com");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("ebayweb@login");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[4]/button")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[1]/app-admin-sidebar/div/div[2]/button[3]")).click();
		
		Thread.sleep(4000);
	}
	
	@Test(priority=1)
	
	public void userAccount() throws InterruptedException {
		
		
		
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[2]/div/app-user-management/div/div/div[2]/div/div[1]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[2]/div/app-user-management/div/div/div[2]/div/div[2]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[2]/div/app-user-management/div/div/div[2]/div/div[3]")).click();
		
		Thread.sleep(4000);
		
		driver.quit();
		
	}
	
	
	@Test (priority=2)
	
	public void activationShowUser() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[2]/div/app-user-management/div/div/div[3]/div[2]/div/div[2]/div[2]/div/button[1]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[2]/div/app-user-management/div/div/div[3]/div[2]/div/div[2]/div[2]/div/button[1]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[2]/div/app-user-management/div/div/div[3]/div[2]/div/div[2]/div[2]/div/button[2]")).click();
		
		Thread.sleep(4000);
		
		driver.quit();		
	}
	
	
	@Test(priority=3)
	
	public void Usersearch() {
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[2]/div/app-user-management/div/div/div[3]/div[1]/div/input")).sendKeys("subha");
		
		driver.quit(); 
		
	}
	
	
	
	
	

}
