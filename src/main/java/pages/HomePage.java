package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	By homePageUserName = By.xpath("//header/div[1]/div[1]/span/h6");
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
	}
	
	//Get the user name from the home page
	public String getHomePageUserName() {
		return driver.findElement(homePageUserName).getText();
	}
}
