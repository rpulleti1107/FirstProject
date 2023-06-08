package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage {
	
	@Test
	public void test_HomePage_Appear_Correct() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Software\\drivers\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form/div[3]/button")).click();
		
		String homeText = driver.findElement(By.xpath("//header/div[1]/div[1]/span/h6")).getText();
		Assert.assertTrue(homeText.contains("Dashboard"));
		
		driver.close();
		
	}
	

}
