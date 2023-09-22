package UserApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRedirectionUR {
	
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
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	
	}
	
	
	@Test
	
	public void savelist() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='toggle-button ng-star-inserted']")).click();
		driver.findElement(By.xpath("//button[@class='toggle-button ng-star-inserted']")).click();
		
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//div/button[2][@class='sidebar-btn']")).click();
		
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//div/button[3][@class='sidebar-btn']")).click();
		
		
		Thread.sleep(6000);
		
	driver.findElement(By.xpath("//div/button[4][@class='sidebar-btn']")).click();
		
		
		Thread.sleep(6000);
		
	driver.findElement(By.xpath("//div/button[5][@class='sidebar-btn']")).click();
		
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//div/button[6][@class='sidebar-btn']")).click(); //video
		
		
	Thread.sleep(6000);
	
	//driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-seminar/div/app-sub-seminar/div/div[1]/div[1]/button[2]")).click();
	

	//Thread.sleep(6000);
	
		
		driver.findElement(By.xpath("//div/button[7][@class='sidebar-btn']")).click();
		
		Thread.sleep(6000);
		
		
	 WebElement itemsPerPageDropDown = driver.findElement(By.xpath("//button[8][@class='sidebar-btn']"));
		
	 
	 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", itemsPerPageDropDown);
		
		driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[1]/app-sidebar/div/div/button[8]/div")).click();
		
		
		
		
		

		driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-main-settings/div/div/div[2]/h3")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-main-settings/div/div/div[3]/h3")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-main-settings/div/div/div[4]/h3")).click();
		
		
		
		
		
		
		
		
		
		
		driver.findElement(By.xpath("//button[@class='scrape-button ng-star-inserted']")).click();
		
		
		
		
	}
	
	
	
	
}
	

