package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Login;

public class LoginPage {
	WebDriver driver;
	Login objLogin;
	HomePage objHomePage;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Software\\drivers\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
	}
	//This is TestNG step
	@Test
	public void test_HomePage_Appear_Correct() throws InterruptedException {
		objLogin = new Login(driver);
		
		objLogin.loginToApplication("Admin", "admin123");
		//go to next page
		objHomePage = new HomePage(driver);
		//Verify home page user name
		Assert.assertTrue(objHomePage.getHomePageUserName().contains("Dashboard"));
	}

}
