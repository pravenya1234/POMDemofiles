package demoWebShopPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


	public class RegisterPagePOM {
	 WebDriver driver;
	By male=By.xpath("//input[@id='gender-male']");
	By female=By.xpath("//input[@id='gender-female']");
	By firstname=By.id("FirstName");
	By lastname=By.id("LastName");
	By email=By.id("Email");
	By password=By.id("Password");
	By cofirmpassword=By.id("ConfirmPassword");
	By register=By.xpath("//input[@id='register-button']");
	By clickregister=By.xpath("//a[@class='ico-register']");
	//public String result=driver.findElement(By.xpath("//*[contains(text(),'Your registration completed')]")).getText();
	//public String outputresult=driver.findElement(By.xpath(result)).gettext();

	public  RegisterPagePOM(WebDriver driver){
	this.driver=driver;
	}
	public void gender(){
		driver.findElement(male).click();
	}
	public void gender1(){
		driver.findElement(female).click();
	}
	public void email(String EM){
		driver.findElement(email).sendKeys(EM);
	}
	public void firstname(String FM){
		driver.findElement(firstname).sendKeys(FM);
	}
	public void lastname(String LM){
		driver.findElement(lastname).sendKeys(LM);
	}
	public void password(String PWD){
		driver.findElement(password).sendKeys(PWD);
	}
	public void confirmpassword(String CPWD){
		driver.findElement(cofirmpassword).sendKeys(CPWD);
	}
	public void register(){
		driver.findElement(register).click();
	}
	public void clickregister(){
		driver.findElement(clickregister).click();
	}
	
}
