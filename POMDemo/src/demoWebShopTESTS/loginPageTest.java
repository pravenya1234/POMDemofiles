package demoWebShopTESTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import demoWebShopPOM.LoginPagePOM;

public class loginPageTest {
	@Test
	public void checklogin(){
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		LoginPagePOM login=new LoginPagePOM(driver);
		login.enteremail("gpravenya97@gmail.com");
		login.enterpassword("Pravenya@123");
		login.clicklogin();
	}
}
