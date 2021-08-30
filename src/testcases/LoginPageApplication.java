package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectsrepository.HomePage;
import objectsrepository.LoginPage;

public class LoginPageApplication {

	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://login.salesforce.com/?locale=in");
		
		LoginPage loginPage= new LoginPage(driver);
		loginPage.username().sendKeys("admin");
		loginPage.password().sendKeys("admin");
		loginPage.login().click();
		
		HomePage homePage= new HomePage(driver);
		homePage.tryForFreeUrl().click();
		homePage.firstName().sendKeys("Anu");
		homePage.lastName().sendKeys("Emmanuel");
	}
}
