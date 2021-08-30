package objectsrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePFactory {
	
	WebDriver driver;
	
	public LoginPagePFactory(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="Login")
	WebElement login;
	
	public WebElement username() {
		
		return username;
	}
	public WebElement password()
	{
		return password;	
	}
    public WebElement login()
    {
    	return login;
    }
    }
