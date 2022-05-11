package PurpleStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class storeSetup {
	
	WebDriver driver;
	
	public storeSetup(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By sn = By.id("storename");
	public WebElement storeName()
	{
		return driver.findElement(sn);
	}
	
	By rd = By.xpath("//input[@value='5']");
	public WebElement radio()
	{
		return driver.findElement(rd);
	}
	
	By check = By.id("agreement");
	public WebElement checkB()
	{
		return driver.findElement(check);
	}
	
	By o = By.id("otp");
	public WebElement OTP()
	{
		return driver.findElement(o);
	}
	
	By crcl = By.xpath("//button[contains(text(),'Create Store')]");
	public WebElement creat()
	{
		return driver.findElement(crcl);
	}
}
