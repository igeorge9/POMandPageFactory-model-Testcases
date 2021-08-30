package objectsrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By tryForFreeUrl= By.id("signup_link");
	By firstName= By.name("UserFirstName");
	By lastName= By.name("UserLastName");
	
	public WebElement tryForFreeUrl()
	{
		return driver.findElement(tryForFreeUrl);
	}
	
	public WebElement firstName()
	{
		return driver.findElement(firstName);
	}
	public WebElement lastName()
	{
		return driver.findElement(lastName);
	}

}
