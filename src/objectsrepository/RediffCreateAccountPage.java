package objectsrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffCreateAccountPage {

	WebDriver driver;
	
	public RediffCreateAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css="a[title='Create Rediffmail Account']")
	WebElement createAccount;
	
	@FindBy(name="name692234f4")
	WebElement name;
	
	@FindBy(name="passwd692234f4")
	WebElement password;
	
	@FindBy(id="Register")
	WebElement submitButton;
	
	public WebElement createAccount()
	{
		return createAccount;
	}
	public WebElement name()
	{
		return name;
	}
	public WebElement password()
	{
		return password;
	}
	public WebElement submitButton()
	{
		return submitButton;
	}
}
