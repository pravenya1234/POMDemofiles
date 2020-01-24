package demoWebShopTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import demoWebShopPOM.LoginPagePOM;
import demoWebShopPOM.RegisterPagePOM;

public class BothLoginAndRegisterTest {
	WebDriver driver;
	@BeforeMethod
	public void startApp(){
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com");
			driver.manage().window().maximize();
	}
	@Test
	public void checkregister() throws InterruptedException{
		
		
		RegisterPagePOM reg=new RegisterPagePOM(driver);
		reg.clickregister();
		reg.gender();
		reg.gender1();
		reg.firstname("Pravenya1");
		reg.lastname("Gonuguntla1");
		reg.email("gpi@gmail.com");
		reg.password("Prav@123");
		reg.confirmpassword("Prav@123");
		reg.register();
		Thread.sleep(3000);
		String expectedtitle="Your registration completed";
		
		String title=driver.findElement(By.xpath("//*[contains(text(),'Your registration completed')]")).getText();
		Assert.assertEquals(expectedtitle,title);
		//System.out.println(title);
	/*	String title=reg.result;
		String expected="Your registration completed";
		Assert.assertEquals(expected,title);*/
		
		
}
	@Test(priority=1)
	public void checklogin(){
		
		LoginPagePOM login=new LoginPagePOM(driver);
		login.clickloginlink();
		login.enteremail("gpr123@gmail.com");
		login.enterpassword("Prav@123");
		login.clicklogin();
		String expectedresult="gpr123@gmail.com";
		String title=driver.findElement(By.xpath("//a[contains(text(),'gpr123@gmail.com')]")).getText();
		Assert.assertEquals(expectedresult,title);

	}
	@AfterMethod
	public void close(){
		driver.close();
	}
	
}
