package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectsrepository.RediffCreateAccountPage;

public class RediffApplication {
	
	@Test
	public void createAccountPage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
		Thread.sleep(2000L);
		RediffCreateAccountPage createAccount = new RediffCreateAccountPage(driver);
//		createAccount.createAccount().click();
		createAccount.name().sendKeys("Annika");
		createAccount.password().sendKeys("Annya1324/*");
		createAccount.submitButton().click();
	}

}
