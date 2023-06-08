package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	By user = By.name("username");
	By password = By.name("password");
	By login = By.xpath("//form/div[3]/button");
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUserName(String strUserName) {
		driver.findElement(user).sendKeys(strUserName);
	}
	
	public void setPassword(String strPassword) {
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(strPassword);
	}
	
	public void clickLogin() {
		driver.findElement(login).click();
	}
	
	public void loginToApplication(String strUserName,String strPassword) {
		//fill user name
		this.setUserName(strUserName);
		this.setPassword(strPassword);
		this.clickLogin();
	}
	
}
