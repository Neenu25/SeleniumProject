package UserApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
	driver = new ChromeDriver();
	driver.get("https://di6mm4n235un2.cloudfront.net/auth/home");
	driver.manage().window().maximize();
	
	}
	
	
	@Test(priority=1)
		public void testcase1()  {
			
			
			//WebDriver driver = new ChromeDriver();
			
			
			//valid inputs	
			
			driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan10@gmail.com");
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Subha@123");
			driver.findElement(By.xpath("//button[@class='submit-button']")).click();
			//driver.findElement(By.xpath("//div[@class='user-detail']/div/img")).click();
			//driver.findElement(By.xpath("")).click();
			//Thread.sleep(6000);
			driver.quit();
	}
	
	@Test(priority=2)
	public void testcase2() {
			
			//valid username and invalid password
			
			driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan10@gmail.com");
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Subh@123");
			driver.findElement(By.xpath("//button[@class='submit-button']")).click();
			
			//Thread.sleep(6000);
			driver.quit();
	}
	
	@Test(priority=3)
			public void testcase3() {
			//invalid username and valid password
			
			driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan@gmail.com");
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Subha@123");
			driver.findElement(By.xpath("//button[@class='submit-button']")).click();
			
			
			driver.quit();
			}
			
	@Test(priority=4)
			public void testcase4() {
			//invalid username and invalid password
			
			driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan@gmail.com");
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Subha@243");
			driver.findElement(By.xpath("//button[@class='submit-button']")).click();
			
			
			
		}
		
	
}


