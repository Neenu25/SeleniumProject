package UserApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginUR {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
	driver = new ChromeDriver();
	driver.get("https://di6mm4n235un2.cloudfront.net/auth/home");
	driver.manage().window().maximize();
	
	}
	
	
	@Test(priority=1)
		public void testcase1() throws InterruptedException  {
			
			
			
			
			//valid inputs	
			
			driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan10@gmail.com");
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Subha@123");
			driver.findElement(By.xpath("//button[@class='submit-button']")).click();
			
			Thread.sleep(4000);
			
			
			String toastText = driver.findElement(By.id("toast-container")).getText();
			
			System.out.println("Toast Message is "+toastText);
			
			
			
			driver.quit();
	}
	
	@Test(priority=2)
	public void testcase2() throws InterruptedException {
			
			//valid username and invalid password
			
			driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan10@gmail.com");
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Subh@123");
			driver.findElement(By.xpath("//button[@class='submit-button']")).click();
			
			Thread.sleep(4000);	
			
			String toastText2 = driver.findElement(By.id("toast-container")).getText();
			
			System.out.println("Toast Message is "+toastText2);
			
			
			
			
			
			driver.quit();
	}
	
	@Test(priority=3)
			public void testcase3() throws InterruptedException {
			//invalid username and valid password
			
			driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan@gmail.com");
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Subha@123");
			driver.findElement(By.xpath("//button[@class='submit-button']")).click();
			Thread.sleep(4000);	
			
			String toastText3 = driver.findElement(By.id("toast-container")).getText();
			
			System.out.println("Toast Message is "+toastText3);
			
			
			
			
			driver.quit();
			}
			
	@Test(priority=4)
			public void testcase4() throws InterruptedException {
			//invalid username and invalid password
			
			driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan@gmail.com");
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Subha@243");
			driver.findElement(By.xpath("//button[@class='submit-button']")).click();
			
			Thread.sleep(4000);	
			
			String toastText4 = driver.findElement(By.id("toast-container")).getText();
			
			System.out.println("Toast Message is "+toastText4);
			
			driver.quit();
			
			
		}
	
	@Test(priority=5)
	
	public void testcase5() throws InterruptedException {

	driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
	driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("");
	driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("");
	driver.findElement(By.xpath("//button[@class='submit-button']")).click();
	
	Thread.sleep(4000);
	
	
	String toastText5 = driver.findElement(By.id("toast-container")).getText();
	
	System.out.println("Toast Message is "+toastText5);
	
	
	
	driver.quit();
	
	
	}
		
	
}


