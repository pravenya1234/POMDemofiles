package demoWebShopTESTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import demoWebShopPOM.RegisterPagePOM;

public class RegisterPageTest {
	@Test
	public void checkregister(){
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		RegisterPagePOM reg=new RegisterPagePOM(driver);
		reg.gender();
		reg.gender1();
		reg.firstname("Pravenya");
		reg.lastname("Gonuguntla");
		reg.email("gpr@gmail.com");
		reg.password("Prav@123");
		reg.confirmpassword("Prav@123");
		reg.register();
}
}
