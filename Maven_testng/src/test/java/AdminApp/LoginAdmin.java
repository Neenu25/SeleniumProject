package AdminApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginAdmin {
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver = new ChromeDriver();
		driver.get("http://admin-panel-staging-ebay.s3-website-ap-northeast-1.amazonaws.com/auth/home");
		driver.manage().window().maximize();
	}

	@Test(priority=1)
	
	public void testcase1() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("rosemary@stunntech.com");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("ebayweb@login");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[4]/button")).click();
		Thread.sleep(3000);
		
		//toast message handling
		
		String toastText = driver.findElement(By.id("toast-container")).getText();
		
		System.out.println("Toast Message is "+toastText);
		
		
		
		
		
		driver.quit();
	}
	
	//invalid username and invalid password
	
	@Test(priority=2)
	
	public void testcase2() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("rosemary@stunntec.com");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("ebay@login");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[4]/button")).click();
		Thread.sleep(2000);
		
		String toastText1 = driver.findElement(By.id("toast-container")).getText();
		
		System.out.println("Toast Message is "+toastText1);
		
		driver.quit();
		
	}
	
	// valid username and invalid password
	
	@Test(priority=3)
	
	public void testcase3() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("rosemary@stunntech.com");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("ebay@login");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[4]/button")).click();
		Thread.sleep(2000);
		
		
		String toastText2 = driver.findElement(By.id("toast-container")).getText();
		
		System.out.println("Toast Message is "+toastText2);
		
		
		
		driver.quit();
		
	}
	
	//invalid username and valid password
	
	@Test(priority=4)
	
	public void testcase4() throws InterruptedException {
	
	driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("rosemary@stunntech.c");
	driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("ebayweb@login");
	driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[4]/button")).click();
	Thread.sleep(2000);
	
	
	String toastText3 = driver.findElement(By.id("toast-container")).getText();
	
	System.out.println("Toast Message is "+toastText3);
	
	
	driver.quit();
	
	
	}
	
	//without providing any credentials
	
	@Test(priority=5)
	public void testcase5() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[4]/button")).click();
		Thread.sleep(2000);
		
		String toastText4 = driver.findElement(By.id("toast-container")).getText();
		
		System.out.println("Toast Message is "+toastText4);
		
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
